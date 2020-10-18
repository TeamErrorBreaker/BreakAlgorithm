package 심성헌.알고리즘_3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 큰수의법칙_이코테 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer[] st = new StringTokenizer[2];

		for (int i = 0; i < st.length; i++) {
			st[i] = new StringTokenizer(br.readLine(), " ");
		}

		int[][] input = new int[st[0].countTokens()][st[1].countTokens()];

		for (int i = 0; i < st.length; i++) {
			int m = 0;
			while (st[i].hasMoreTokens()) {
				input[i][m] = Integer.parseInt(st[i].nextToken());
				m++;
			}

		}

		int sumCount = input[0][1] / input[0][2];
		int max = input[1][0];

		// 배열 내림차순으로 정렬하기
		for (int i = 0; i < input[1].length; i++) {
			for (int k = i + 1; k < input[1].length; k++) {
				if (input[1][k] > input[1][i]) {
					max = input[1][k];
					input[1][k] = input[1][i];
					input[1][i] = max;
				}
			}
		}

		int count = 0;
		int result = input[1][0];

		// 최댓값은 반복할 수 있는 만큼 더하고, 그 이후 두 번째 최댓값을 더한다.
		// 해당 배열에서 조건에 충족할 때, 최댓값이 얼마인지 출력해라!
		for (int i = 0; i < input[0][1]; i++) {

			if (count < sumCount) {
				result += input[1][0];
				count++;
			} else if (count >= sumCount) {
				count = 0;
			} else {
				result += input[1][1];
			}

		}
		System.out.println(result);
	}

}
