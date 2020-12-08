package 심성헌.알고리즘_6주차;

import java.util.*;

public class 크레인인형뽑기게임_프로그래머스 {
	public static void main(String[] args) {

		int[][] answer = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println();
		int result = solution(answer, moves);

		System.out.println(result);
	}

	public static int solution(int[][] board, int[] moves) {

		Stack<Integer> stack = new Stack<Integer>();
		int answer = 0;
		// moves의 데이터는 인형이 쌓여있는 board의 세로축 인덱스 번호
		// moves의 길이만큼 반복
		for (int i = 0; i < moves.length; i++) {
			
			// 현재 board의 세로축 길이만큼 반복
			for (int k = 0; k < board.length; k++) {
				
				// 만약 board의 세로축에 0이 아닌 경우는 가장 위에 있는 인형이므로
				// 바구니에 쌓을 준비를 한다.
				if (board[k][moves[i] - 1] != 0) {
					int tmp = board[k][moves[i] - 1];
					
					// 만약 바구니가 비어 있거나 바구니의 제일 위에 쌓인 인형과 board의 현재 인형이 다르다면
					if (stack.isEmpty() || stack.peek() != tmp) {
						
						// 바구니에 board 인형 넣기
						stack.push(board[k][moves[i] - 1]);

						// 만약 바구니의 제일 위에 쌓인 인형과 board의 현재 인형과 같다면
					} else if (stack.peek() == tmp) {
						
						// 바구니의 인형 삭제
						stack.pop();
						answer++;
					}
					// 현재 검사한 인형의 자리는 뺀다.
					board[k][moves[i] - 1] = 0;
					break;
				}
			}
		}

		return answer * 2;
	}
}
