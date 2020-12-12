package 심성헌.알고리즘_6주차;

import java.util.*;

public class 같은숫자는싫어_프로그래머스_Set {
	public static void main(String[] args) {
		int[] arr = { 4, 4, 4, 3, 3 };
		int[] result = solution(arr);

		for (int data : result) {
			System.out.print(data + " ");
		}
	}

	public static int[] solution(int[] arr) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1])
				list.add(arr[i]);
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
