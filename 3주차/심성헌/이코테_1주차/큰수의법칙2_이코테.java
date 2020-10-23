package 심성헌.이코테_1주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 큰수의법칙2_이코테 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer[] st = new StringTokenizer[2];

		// 데이터 입력 준비
		for (int i = 0; i < st.length; i++) {
			st[i] = new StringTokenizer(br.readLine(), " ");
		}

		int[][] input = new int[st[0].countTokens()][st[1].countTokens()];

		// 데이터 입력하기
		for (int i = 0; i < st.length; i++) {
			int m = 0;
			while (st[i].hasMoreTokens()) {
				input[i][m] = Integer.parseInt(st[i].nextToken());
				m++;
			}

		}

		// 두 번째로 입력받은 데이터 내림차순으로 정렬하기
		for (int i = 0; i < input[1].length; i++) {
			for (int k = i + 1; k < input[1].length; k++) {
				if (input[1][k] > input[1][i]) {
					int max = input[1][k];
					input[1][k] = input[1][i];
					input[1][i] = max;
				}

			}

		}

		int m = input[0][1];
		int k = input[0][2];
		int max = input[1][0];
		int max_2 = input[1][1];

		int count = (m / (k + 1)) * k;
		count += m % (k + 1);

		int result = 0;
		result += count * max;
		result += (m - count) * max_2;

		System.out.println(result);

	}

}
