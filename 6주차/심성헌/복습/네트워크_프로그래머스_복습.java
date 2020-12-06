package 심성헌.복습;

public class 네트워크_프로그래머스_복습 {

	public static int[][] network = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
	public static int cnt;

	public static void main(String[] args) {
		boolean[] check = new boolean[network.length];
		for (int i = 0; i < network.length; i++) {
			if(!check[i]) {
				dfs(i, network, check);
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static void dfs(int idx, int[][] arr, boolean[] check) {
		check[idx] = true;

		for (int i = 0; i < arr[idx].length; i++) {
			if (check[i] == false && arr[idx][i] == 1) {
				dfs(i, arr, check);
			}
		}
	}
}
