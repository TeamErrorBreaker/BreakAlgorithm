package 모바일리더_코딩테스트_02;

public class question_02 {

	public int solution(int n) {
		// Write code here.
		int[][] cube = new int[n][n];
		int[] dx = { 0, 1, 0, -1 }, dy = { 1, 0, -1, 0 };
		int x = 0, y = 0;
		int cnt = 1;

		while ((x > -1 && y > -1 && x < n && y < n) && cube[x][y] == 0) {
			for (int i = 0; i < 4; i++) {
				if (!(x > -1 && y > -1 && x < n && y < n) || cube[x][y] != 0)
					break;
				while (true) {
					cube[x][y] = cnt++;
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (!(nx > -1 && ny > -1 && nx < n && ny < n) || cube[nx][ny] != 0) {
						x += dx[(i + 1) % 4];
						y += dy[(i + 1) % 4];
						break;
					}
					x = nx;
					y = ny;
				}
			}
		}

		for (int i = 0; i < cube.length; i++) {
			for (int k = 0; k < cube[i].length; k++) {
				System.out.print(cube[i][k] + " ");
			}
			System.out.println();
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			answer += cube[i][i];
		}
		return answer;
	}

	// The following is main method to output testcase.
	public static void main(String[] args) {
		question_02 sol = new question_02();
		int n1 = 3;
		int ret1 = sol.solution(n1);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret1 + " .");

		int n2 = 2;
		int ret2 = sol.solution(n2);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret2 + " .");
	}
}
