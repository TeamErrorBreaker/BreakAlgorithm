package 심성헌.알고리즘_4주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 음료수얼려먹기_이코테 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static int m;
	static int arr[][];

	public static boolean ice(int x, int y) {
		boolean check = x <= -1 || y <= -1 || x >= n || y >= m;
		if (check) {
			return false;
		}

		if (arr[x][y] == 0) {
			System.out.println("[" + x + "][" + y + "] : " + true + " / " + arr[x][y]);
			arr[x][y] = 1;
			ice(x - 1, y);
			ice(x, y - 1);
			ice(x + 1, y);
			ice(x, y + 1);
			return true;
		}
		System.out.println("[" + x + "][" + y + "] : " + false + " / " + arr[x][y]);
		System.out.println("-----------------------------");
		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		arr = new int[n][m];

		for (int i = 1; i < arr.length; i++) {
			String data = br.readLine();
			for (int k = 0; k < arr[i].length; k++) {
				arr[i][k] = Integer.parseInt(String.valueOf(data.charAt(k)));
			}

		}

		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				boolean check = ice(i, k);
				if (check) {
					count++;
				}

			}

		}
		System.out.println(count);

	}

}
