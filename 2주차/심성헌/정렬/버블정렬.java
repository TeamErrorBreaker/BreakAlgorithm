package 심성헌.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 버블정렬 {

	public static void change(int[] n, int i, int k) {

		int save = n[i];
		n[i] = n[k];
		n[k] = save;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());

		int[] n = new int[length];

		for (int i = 0; i < length; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}

		// 오름차순 버블 정렬 시작!
		// 책에서는 역순으로 설명하는데 구조는 일단 동일한 것 같아서 패스!
		int lengthSub = length;
		for (int i = 0; i < length; i++) {
			for (int k = 0; k < lengthSub; k++) {
				if (k + 1 < length) {
					if (n[k] < n[k + 1]) {
						change(n, k, k + 1);
					}
				}
			}
			lengthSub--;
		}

		for (int i = 0; i < length; i++) {
			System.out.print(n[i] + " ");
		}
	}
}
