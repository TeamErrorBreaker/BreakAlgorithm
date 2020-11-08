package 심성헌.알고리즘_5주차.프로그래머스;

public class 네트워크 {

	public static void main(String[] args) {
		int n = 4;
		int[][] computers = { { 1, 1, 1, 1 }, { 1, 1, 1, 0 }, { 1, 1, 1, 0 }, { 1, 0, 0, 1 } };
		int result = 0;
		boolean[] visitied = new boolean[n];

		for (int i = 0; i < computers.length; i++) {
			if (!visitied[i]) {
				dfs(i, computers, visitied);
				result++;
			}
		}
		System.out.println(result);
	}

	static public void dfs(int n, int[][] computers, boolean[] visitied) {
		visitied[n] = true;
		for (int i = 0; i < computers[n].length; i++) {
			if (!visitied[i] && computers[n][i] == 1) {
				dfs(i, computers, visitied);
			}
		}
	}
}
