package 심성헌.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class 최댓값 {

	static public int max(int[] a) {

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		return max;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random random = new Random();
		System.out.print("배열 길이 : ");
		int n = Integer.parseInt(br.readLine()); // 배열 길이
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = random.nextInt(100);
		}
		int max = max(array);
		System.out.println("최댓값 : " + max);
	}
}
