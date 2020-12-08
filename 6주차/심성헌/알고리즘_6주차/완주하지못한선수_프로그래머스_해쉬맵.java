package 심성헌.알고리즘_6주차;

import java.util.*;

public class 완주하지못한선수_프로그래머스_해쉬맵 {
	public static void main(String[] args) {
		String[] arr = { "mislav", "stanko", "mislav", "ana" };
		String[] comp = { "stanko", "ana", "mislav" };

		String result = solution(arr, comp);
		System.out.println(result);

	}

	public static String solution(String[] participant, String[] completion) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String name : participant) {
			map.put(name, map.getOrDefault(name, 0) + 1);
		}

		for (String name : completion) {
			map.put(name, map.get(name) - 1);
		}

		String answer = "";
		for (String name : map.keySet()) {
			if (map.get(name) != 0) {
				answer = name;
				break;
			}
		}
		return answer;
	}
}
