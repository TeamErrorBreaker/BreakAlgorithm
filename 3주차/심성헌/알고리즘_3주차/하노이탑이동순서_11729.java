package 심성헌.알고리즘_3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하노이탑이동순서_11729 {

	static StringBuffer sb = new StringBuffer();
	static int count = 0;

	static public int move(int n, int x, int y) {
		if (n > 1) {
			move(n - 1, x, 6 - x - y);
		}

		sb.append(x + " " + y + "\n");
		count++;

		if (n > 1) {
			move(n - 1, 6 - x - y, y);
		}

		return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int count = move(n, 1, 3);
		System.out.println(count);
		System.out.println(sb.toString());
	}

}
