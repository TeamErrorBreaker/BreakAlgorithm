package 심성헌.알고리즘_5주차;

import java.io.*;
import java.util.*;

public class 단지번호붙이기_BFS {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static int length = 0;
	static int cnt = 0;
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		StringTokenizer[] st = new StringTokenizer[n];
		for (int i = 0; i < n; i++) {
			st[i] = new StringTokenizer(br.readLine());
			char[] tmp = st[i].nextToken().toCharArray();
			for (int k = 0; k < tmp.length; k++) {
				arr[i][k] = tmp[k] - '0';
			}
		}
		int[] xy = { 0, 0 };
		bfs(xy);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = ");
			for (int k = 0; k < arr[i].length; k++) {
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}
	}

	public static void bfs(int[] xy) {

		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(xy);

		while (!queue.isEmpty()) {
			xy = queue.poll();
			int[][] nxy = { { -1, 1, 0, 0 }, { 0, 0, -1, 1 } };

			for (int i = 0; i < 4; i++) {
				nxy[0][i] = xy[0] + nxy[0][i];
				nxy[1][i] = xy[1] + nxy[1][i];
				int[] tmp = { nxy[0][i], nxy[1][i] };
				
				if (nxy[0][i] < 0 || nxy[1][i] < 0 || nxy[0][i] >= n || nxy[1][i] >= n)
					continue;
				
				System.out.println("arr[" + nxy[0][i] + "][" + nxy[1][i] + "] = " + arr[nxy[0][i]][nxy[1][i]]);
				
				if (arr[nxy[0][i]][nxy[1][i]] == 1) {
					arr[nxy[0][i]][nxy[1][i]] = 5;
					queue.offer(tmp);
					cnt++;
				}
			}
		}
	}
}