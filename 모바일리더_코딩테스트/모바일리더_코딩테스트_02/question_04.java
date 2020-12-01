package 모바일리더_코딩테스트_02;

import java.util.*;

public class question_04 {
	public int[] solution(int[] arrA, int[] arrB) {
		int arrA_idx = 0, arrB_idx = 0;
		int arrA_len = arrA.length;
		int arrB_len = arrB.length;
		int answer[] = new int[arrA_len + arrB_len];
		int answer_idx = 0;
		while (answer_idx < answer.length && arrA_idx < arrA.length && arrB_idx < arrB.length ) {
			if (arrA[arrA_idx] < arrB[arrB_idx])
				answer[answer_idx++] = arrA[arrA_idx++];
			else
				answer[answer_idx++] = arrB[arrB_idx++];
		}
		while (arrA_idx < arrA.length)
			answer[answer_idx++] = arrA[arrA_idx++];
		while (arrB_idx < arrB.length)
			answer[answer_idx++] = arrB[arrB_idx++];
		return answer;
	}

	// The following is main method to output testcase.
	public static void main(String[] args) {
		question_04 sol = new question_04();
		int[] arrA = { -2, 3, 5, 9 };
		int[] arrB = { 0, 1, 5 };
		int[] ret = sol.solution(arrA, arrB);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
	}
}
