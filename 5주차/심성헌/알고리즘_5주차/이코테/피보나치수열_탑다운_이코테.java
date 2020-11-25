package 심성헌.알고리즘_5주차.이코테;

import java.io.*;

public class 피보나치수열_탑다운_이코테 {
	
// 자바의 경우 99번째 피보나치 수열의 값이 long의 범위를 벗어나기 때문에 BigInteger라는 클래스를 import 해야 한다.

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static long[] d = new long[100];

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());
		System.out.println(fibo(n));
	}

	public static long fibo(int x) {
		if (x == 1 || x == 2)
			return 1;
		if (d[x] != 0)
			return d[x];
		d[x] = fibo(x - 1) + fibo(x - 2);
		System.out.println("d[" + x + "] = " + d[x]);
		return d[x];
	}
}
