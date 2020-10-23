package 심성헌.알고리즘_3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈_5585 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 1000 - Integer.parseInt(br.readLine());
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int count = 0;
		int result = 0;

		for (int i = 0; i < coin.length; i++) {
			if (n >= coin[i]) {
				count = n / coin[i];
				result += count;
				n = n - (coin[i] * count);
			}

		}
		System.out.println(result);
	}

}
