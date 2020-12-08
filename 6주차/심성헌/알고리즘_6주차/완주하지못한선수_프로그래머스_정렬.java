package 심성헌.알고리즘_6주차;

import java.util.*;

public class 완주하지못한선수_프로그래머스_정렬 {
	public static void main(String[] args) {
		String[] arr = { "mislav", "stanko", "mislav", "ana" };
		String[] comp = { "stanko", "ana", "mislav" };

		String result = solution(arr, comp);
		System.out.println(result);

	}

	public static String solution(String[] arr, String[] comp) {
		Arrays.sort(arr);
		Arrays.parallelSort(comp);

		int idx = 0;
		for (String name : comp) {
			if (!name.equals(arr[idx])) {
				return arr[idx];
			}
			idx++;
		}

		return arr[arr.length - 1];
	}
}
