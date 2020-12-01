package 모바일리더_코딩테스트_02;

public class question_06 {

	static int score = 0;

	public int scissors(int b) {
		if (b == 2) {
			return 3;
		} else if (b == 1) {
			return -1;
		} else {
			return 0;
		}
	}

	public int rock(int b) {
		if (b == 0) {
			return 3;
		} else if (b == 2) {
			return -1;
		} else {
			return 0;
		}
	}

	public int paper(int b) {
		if (b == 1) {
			return 3;
		} else if (b == 0) {
			if (score == 0) {
				return 0;
			}
			return -1;
		} else {
			return 0;
		}
	}

	public int solution(int[] recordA, int[] recordB) {

		for (int i = 0; i < recordA.length; i++) {
			switch (recordA[i]) {
			case 0:
				score += scissors(recordB[i]);
				break;
			case 1:
				score += rock(recordB[i]);
				break;

			default:
				score += paper(recordB[i]);
				break;
			}
			System.out.println("score = " + score);
		}
		return score;
	}

	public static void main(String[] args) {
		question_06 sol = new question_06();
		int[] recordA = { 2, 0, 0, 0, 0, 0, 1, 1, 0, 0 };
		int[] recordB = { 0, 0, 0, 0, 2, 2, 0, 2, 2, 2 };
		int score = sol.solution(recordA, recordB);
		System.out.println(score);
	}
}
