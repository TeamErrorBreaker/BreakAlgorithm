package 심성헌.알고리즘_5주차;

import java.io.*;
import java.util.*;

public class 단지번호붙히기_2667 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, x, y;
	static int length = 0;
	static int cnt = 0;
	static int[][] nxy = { { -1, 1, 0, 0 }, { 0, 0, -1, 1 } };
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		StringTokenizer[] st = new StringTokenizer[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			st[i] = new StringTokenizer(br.readLine());
			char[] tmp = st[i].nextToken().toCharArray();
			for (int k = 0; k < tmp.length; k++) {
				arr[i][k] = tmp[k] - '0';
			}
		}
		for (int i = 0; i < arr.length; i++) {
			boolean check = false;
			for (int k = 0; k < arr[i].length; k++) {
				check = bfs(i, k);
				System.out.println("---------------------------");
				if (check) {
					list.add(cnt);
					length++;
					cnt = 0;
				}
			}
		}
		System.out.println(length);
		Collections.sort(list);
		for (int i : list) {
			System.out.println(i);
		}
	}

	public static boolean bfs(int x, int y) {
		if (x < 0 || y < 0 || x >= n || y >= n)
			return false;

		System.out.println("arr[" + x + "][" + y + "] = " + arr[x][y]);
		if (arr[x][y] == 1) {
			arr[x][y] = 5;
			bfs(x - 1, y);
			bfs(x + 1, y);
			bfs(x, y - 1);
			bfs(x, y + 1);
			cnt++;
			return true;
		}
		return false;
	}
}