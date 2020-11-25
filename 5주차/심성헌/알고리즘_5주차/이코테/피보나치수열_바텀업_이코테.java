package 심성헌.알고리즘_5주차.이코테;

import java.io.*;

public class 피보나치수열_바텀업_이코테 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static long[] d = new long[100];

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());

		d[1] = 1;
		d[2] = 1;

		for (int i = 2; i < d.length; i++) {
			d[i] = d[i - 1] + d[i - 2];
		}

		System.out.println(d[n]);
	}
}
