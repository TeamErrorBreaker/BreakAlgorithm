package 심성헌.알고리즘_5주차.백준;

import java.io.*;

public class 숫자1로만들기_탑다운 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuffer sb = new StringBuffer();
	static int n;

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());
		sb.append(dp(n, 0));
		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}

	public static int dp(int n, int count) {
		if (n < 2)
			return count;
		return Math.min(dp(n / 2, count + 1 + (n % 2)), dp(n / 3, count + 1 + (n % 3)));
	}
}
