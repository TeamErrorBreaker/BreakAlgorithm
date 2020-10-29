package 심성헌.알고리즘_4주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바이러스_2606 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static int m;
	static int count;
	static boolean[][] graph;
	static boolean[] visited;

	public static void dfs(int index) {
		visited[index] = true;

		for (int i = 1; i <= n; i++) {
			if (graph[index][i] == true && visited[i] == false) {
				count++;
				dfs(i);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		graph = new boolean[n + 1][n + 1];
		visited = new boolean[n + 1];

		for (int i = 1; i <= m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			graph[x][y] = true;
			graph[y][x] = true;
		}
		dfs(1);
		System.out.println(count);
	}
}
