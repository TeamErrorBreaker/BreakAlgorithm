package 심성헌.복습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 바이러스_2606_복습 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static int cnt = 0;
	public static boolean[][] arr;
	public static boolean[] check;

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		arr = new boolean[n + 1][n + 1];
		check = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = true;
			arr[y][x] = true;
		}
		dfs(1);
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}

	public static void dfs(int idx) {
		check[idx] = true;

		for (int i = 1; i < arr.length; i++) {
			if(arr[idx][i] == true && check[i] == false) {
				cnt++;
				dfs(i);
			}
		}
	}
}
