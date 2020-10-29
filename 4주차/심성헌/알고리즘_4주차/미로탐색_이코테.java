package 심성헌.알고리즘_4주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색_이코테 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static int m;
	static int[][] graph;
	static int[] dx = { -1, 1, 0, 0 }; // 상 하
	static int[] dy = { 0, 0, -1, 1 }; // 좌 우

	public static int bfs(int[] xy) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(xy);

		while (!queue.isEmpty()) {
			int[] save = queue.poll();
			xy[0] = save[0];
			xy[1] = save[1];
			for (int i = 0; i < 4; i++) {
				int[] nxy = { xy[0] + dx[i], xy[1] + dy[i] };

				if (nxy[0] < 0 || nxy[1] < 0 || nxy[0] >= n || nxy[1] >= m)
					continue;

				if (graph[nxy[0]][nxy[1]] == 0)
					continue;

				if (graph[nxy[0]][nxy[1]] == 1) {
					graph[nxy[0]][nxy[1]] = graph[xy[0]][xy[1]] + 1;
					queue.offer(nxy);
				}

			}

		}

		return graph[n - 1][m - 1];
	}

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
//		미로의 크기 ==탈출구 좌표 입력
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		graph = new int[n][m];

//		미로 만들기
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int k = 0; k < m; k++) {
				graph[i][k] = input.charAt(k) - '0';
			}

		}
		int[] xy = { 0, 0 };
		System.out.println(bfs(xy));
	}

}
