package 심성헌.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 럭키스트레이트_이코테 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String n;
	static char[][] arr;

	public static void main(String[] args) throws Exception {
		n = br.readLine();
		int length = n.length() / 2;
		arr = new char[2][length];
		arr[0] = n.substring(0, length).toCharArray();
		arr[1] = n.substring(length, n.length()).toCharArray();
		int[] score = { 0, 0 };

		for (int i = 0; i < length; i++) {
			score[0] += (arr[0][i] - '0');
			score[1] += (arr[1][i] - '0');
		}
		System.out.println(score[0] == score [1] ? "LUCKY" : "READY");
	}
}
