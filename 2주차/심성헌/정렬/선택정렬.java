package 심성헌.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 선택정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());

		int[] n = new int[length];

		for (int i = 0; i < length; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}

		int sub;
		int save;

		// 오름차수 선택 정렬 시작
		System.out.print("[ ");
		for (int i = 0; i < length; i++) {
			sub = n[i];

			for (int k = i + 1; k < length; k++) {
				if (sub > n[k]) {
					sub = n[k];

					save = n[i];
					n[i] = n[k];
					n[k] = save;

				}

			}
			System.out.print(n[i] + " ");
		}
		System.out.println("]");
	}

}
