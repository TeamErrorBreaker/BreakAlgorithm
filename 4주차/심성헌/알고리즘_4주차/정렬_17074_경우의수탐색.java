package 심성헌.알고리즘_4주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정렬_17074_경우의수탐색 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, tmp, check, c;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int count = 0;
		while (st.hasMoreTokens()) {
			arr[count] = Integer.parseInt(st.nextToken());
			count++;
		}

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				tmp = i;
				check++;
			}
			if (check > 1) {
				break;
			}
		}

		switch (check) {
		case 0:
			System.out.println(n);
			break;
		case 1:
			if (tmp == n - 2) {
				// 빼야 할 데이터가 뒤에서 두 번째에 위치할 때
				if (arr[tmp - 1] <= arr[tmp + 1]) {
					System.out.println(2);
				} else {
					System.out.println(1);
				}
			} else if (tmp == 0) {
				// 빼야 할 데이터가 0 번째에 위치할 때
				if (arr[tmp] <= arr[tmp + 2]) {
					System.out.println(2);
				} else {
					System.out.println(1);
				}
			} else {
				// 빼야 할 데이터가 배열의 중간에 위치할 때
				if (arr[tmp - 1] <= arr[tmp + 1])
					c++;
				if (arr[tmp] <= arr[tmp + 2])
					c++;
				System.out.println(c);
			}
			break;
		default:
			System.out.println(0);
			break;
		}
	}
}
