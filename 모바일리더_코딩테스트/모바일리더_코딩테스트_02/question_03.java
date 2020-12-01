package 모바일리더_코딩테스트_02;

public class question_03 {

	static int[][] board = new int[8][8];

	public int solution(String pos) {
		// Write code here.
		int x = pos.charAt(0) - 65;
		int y = pos.charAt(1) - 49;

		int[][] xy = new int[8][2];
		int idx = 0, cnt = 0;
		for (int i = -2; i < 3; i++) {
			int k = 0;
			if (i != 0) {
				if (i < 0) {
					k = i + 3;
				} else if (i > 0) {
					k = i - 3;
				}
				xy[idx][0] = i;
				xy[idx][1] = k;
				xy[idx + 4][0] = i;
				xy[idx + 4][1] = -k;
				idx++;
			}
		}
		for (int i = 0; i < xy.length; i++) {
			int nx = x + xy[i][0];
			int ny = y + xy[i][1];
			if (nx > -1 && ny > -1 && nx < 8 && ny < 8) {
				cnt++;
			}
		}
		return cnt;
	}

	// The following is main method to output testcase.
	public static void main(String[] args) {
		question_03 sol = new question_03();
		String pos = "A7";
		int ret = sol.solution(pos);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret + " .");
	}
}
