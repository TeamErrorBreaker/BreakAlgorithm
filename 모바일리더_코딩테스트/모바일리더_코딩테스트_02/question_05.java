package 모바일리더_코딩테스트_02;

import java.util.*;

public class question_05 {
	public int[] solution(int N, int[] votes) {
		int voteCounter[] = new int[11];
		for (int i = 0; i < votes.length; i++) {
			voteCounter[votes[i]] += 1;
			System.out.println(voteCounter[i]);
		}

		int maxVal = 0;
		int cnt = 0;
		for (int i = 0; i <= N; i++) {
			if (maxVal < voteCounter[i]) {
				maxVal = voteCounter[i];
				cnt = 1;
			} else if (maxVal == voteCounter[i]) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
		int[] answer = new int[cnt];
		for (int i = 1, idx = 0; i <= N; i++) {
			if (voteCounter[i] == maxVal) {
				answer[idx] = i;
				idx += 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		question_05 sol = new question_05();
		int N1 = 5;
		int[] votes1 = { 1, 5, 4, 3, 2, 5, 2, 5, 5, 4 };
		int[] ret1 = sol.solution(N1, votes1);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret1) + " .");
        

        int N2 = 4;
        int[] votes2 = {1, 3, 2, 3, 2};
        int[] ret2 = sol.solution(N2, votes2);
 
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret2) + " .");
	}
}
