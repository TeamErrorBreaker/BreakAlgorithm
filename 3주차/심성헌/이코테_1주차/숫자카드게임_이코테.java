package 심성헌.이코테_1주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자카드게임_이코테 {

	public static void main(String[] args) throws IOException {
		// n = 행
		// m = 열
		// 가장 카드를 선택하라. 단, 선택한 행에서 가장 작은 카드만 허용한다.

		// 카드 크기 만들 도구 준비
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// n, m을 받을 배열 준비
		int[] nm = new int[st.countTokens()];

		// n, m 입력
		for (int i = 0; i < nm.length; i++) {
			nm[i] = Integer.parseInt(st.nextToken());
		}

		// n, m에 맞게 카드 준비
		int[][] data = new int[nm[0]][nm[1]];
		StringTokenizer[] input = new StringTokenizer[data.length];

		// 각 카드값 입력 / 입력 마치면 오름차순으로 정렬
		for (int i = 0; i < data.length; i++) {
			input[i] = new StringTokenizer(br.readLine(), " ");

			int m = 0;
			while (input[i].hasMoreTokens()) {
				data[i][m] = Integer.parseInt(input[i].nextToken());
				m++;
			}

			for (int k = 0; k < data[i].length; k++) {
				for (int t = k + 1; t < data[i].length; t++) {
					if (data[i][k] > data[i][t]) {
						int min = data[i][t];
						data[i][t] = data[i][k];
						data[i][k] = min;
					}

				}

			}

		}
		
		// 각 n에 대한 최솟값 비교 -> 본질!
		int max = data[0][0];
		for (int i = 1; i < data.length; i++) {
			if (max < data[i][0]) {
				max = data[i][0];
			}

		}
		
		System.out.println(max);

	}

}
