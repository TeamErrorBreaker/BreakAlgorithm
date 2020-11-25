package 심성헌.알고리즘_5주차.백준;

import java.io.*;

public class 숫자1로만들기_1463 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuffer sb = new StringBuffer();
	static int n;

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());

		int[] node = new int[1000001];

		for (int i = 2; i < n + 1; i++) {
			node[i] = node[i - 1] + 1;
			if (i % 2 == 0) {
				node[i] = Math.min(node[i], node[i / 2] + 1);
			}
			if (i % 3 == 0) {
				node[i] = Math.min(node[i], node[i / 3] + 1);
			}
		}
		sb.append(node[n]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
