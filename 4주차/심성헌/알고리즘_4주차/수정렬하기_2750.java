package 심성헌.알고리즘_4주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기_2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] m = new int[n];

		for (int i = 0; i < m.length; i++) {
			m[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < m.length; i++) {
			for (int k = i; k < m.length; k++) {

				if (m[k] < m[i]) {
					int save = m[i];
					m[i] = m[k];
					m[k] = save;
				}

			}

		}

		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}

	}

}
