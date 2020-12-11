package 심성헌.알고리즘_6주차;

import java.util.*;

public class K번째수_프로그래머스_정렬 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] result = solution(array, commands);

		for (int data : result) {
			System.out.print(data + " ");
		}
	}

	public static int[] solution(int[] array, int[][] commands) {
		// commands 배열 길이만큼의 답안지 배열 만들기
		int[] answer = new int[commands.length];

		// commands 길이만큼 반복하기
		for (int i = 0; i < commands.length; i++) {
			// first, second = array를 자를 idx 범위
			// result = 잘린 array를 정렬한 후 result 번째의 데이터
			int first = commands[i][0] - 1, second = commands[i][1], result = commands[i][2];

			// 임시 저장소를 위한 ArrayList 생성
			ArrayList<Integer> list = new ArrayList<Integer>();

			// array 배열을 자르기 위한 첫 인덱스 번호
			int cnt = first;
			// 자를 범위만큼 반복하여 해당 인덱스의 요소를 list에 저장
			while (true) {
				if (cnt == second)
					break;
				list.add(array[cnt]);
				cnt++;
			}

			// list 오름차순 정렬
			Collections.sort(list);

			// list에서 result - 1의 데이터를 answer[i] 에 저장
			answer[i] = list.get(result - 1);
		}
		return answer;
	}
}
