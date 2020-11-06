package 심성헌.알고리즘_5주차.백준;

import java.io.*;

public class 숫자카드2_10816_입력카운트 {
	public static final int maxVal = 10000000;
	public static int[] a = new int[20000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br.readLine();
		String[] aStrArray = br.readLine().split(" ");
		for (int i = 0; i < aStrArray.length; i++) {
			a[Integer.parseInt(aStrArray[i]) + maxVal] += 1;
		}
		br.readLine();
		String[] bStrArray = br.readLine().split(" ");
		for (int i = 0; i < bStrArray.length; i++) {
			bw.write(a[Integer.parseInt(bStrArray[i]) + maxVal] + " ");
		}
		bw.newLine();
		bw.flush();
	}
}
