package 심성헌.알고리즘_6주차;

import java.util.*;

public class 모의고사_프로그래머스_완전탐색 {
	public static void main(String[] args) {
		int[] answers = { 1, 3, 2, 3, 4, 5 };
		int[] result = solution(answers);

		for (int a : result) {
			System.out.print(a + " ");
		}
	}
	/*
	 * 시험은 최대 10,000 문제로 구성되어 있다. 문제의 정답은 1, 2, 3, 4, 5 중 하나이다. 가장 높은 점수를 받은 사람이 여럿일
	 * 경우, return하는 값을 오름차순 정렬하라.
	 */

	public static int[] solution(int[] answers) {
		// 학생들이 문제를 찍는 규칙
		int[][] student = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		// 점수 저장 배열
		int[] score = new int[student.length];

		// 학생 수 만큼 반복
		for (int i = 0; i < student.length; i++) {
			// 현재 학생의 찍는 규칙 인덱스
			int idx = 0;
			// 현재 학생의 찍은 규칙이 맞은 카운트
			int cnt = 0;
			// 문제수만큼 반복
			for (int j = 0; j < answers.length; j++) {
				// 만약 정답이라면
				if (student[i][idx] == answers[j]) {
					System.out.println("i = " + i + " / j = " + j + " / idx = " + idx);
					cnt++;
				}
				if (idx == student[i].length - 1) {
					idx = 0;
				} else {
					idx++;
				}
			}
			score[i] = cnt;
			System.out.println("cnt = " + score[i]);
			System.out.println();
		}
		int max = Math.max(score[0], Math.max(score[1], score[2]));
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < score.length; i++) {
			if (score[i] == max) {
				list.add(i + 1);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
