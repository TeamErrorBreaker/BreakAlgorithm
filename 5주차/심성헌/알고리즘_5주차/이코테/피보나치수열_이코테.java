package 심성헌.알고리즘_5주차.이코테;

import java.io.*;

public class 피보나치수열_이코테 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());
		
		System.out.println(fibo(n));
	}

	public static int fibo(int x) {
		if (x == 1 || x == 2)
			return 1;
		return fibo(x - 1) + fibo(x - 2);
	}
}
