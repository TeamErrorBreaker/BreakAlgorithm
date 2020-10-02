package 심성헌.알고리즘_1주차;

import java.util.Scanner;

public class OX퀴즈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int score = 0; // OX 별로 점수 배점
		int result = 0; // 인덱스 별 score 합

		String[] ox = new String[n]; // 입력한 만큼의 배열길이 (테스트 케이스)
		int[] print = new int[n];
		for (int i = 0; i < ox.length; i++) {
			// OX 입력
			ox[i] = sc.next();

			// 인덱스 별로 result / score 값 초기화
			result = 0;
			score = 0;

			// 각 인덱스의 문자열 길이만큼 반복
			for (int k = 0; k < ox[i].length(); k++) {
				// 해당 인덱스의 문자열 순서대로 비교
				String content = String.valueOf(ox[i].charAt(k));

				if (content.equals("O")) {
					score++;
				} else {
					score = 0;
				}
				result += score;
			}

			print[i] = result;
			System.out.println(print[i]);
		}

		sc.close();

	}

}
