package 심성헌.알고리즘_4주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정렬_17074_전체탐색 {
// https://data-bank.tistory.com/4
// 내 코드는 주어진 배열에서 하나씩 빼면서 정렬인지 아닌지 확인하기 때문에 시간 초과 문제 발생
// 위의 블로그를 참고해서 경우의 수를 제거하는 방법으로 코드를 짜보자!
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static int[] m;
	static int result;

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());
		m = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		while (st.hasMoreTokens()) {
			m[count] = Integer.parseInt(st.nextToken());
			count++;
		}

		factorial(0);
		System.out.println(result);
	}

	public static void factorial(int index) {
		boolean check = true;
		int[] arr = new int[n - 1];
		int count = 0;
		if (index >= m.length)
			return;
		for (int i = 0; i < n; i++) {
			if (i == index) {
				continue;
			} else {
				arr[count] = m[i];
				System.out.print(arr[count]);
				count++;
			}
		}
		System.out.println();
		int save = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (save <= arr[i]) {
				save = arr[i];
				check = true;
			} else {
				check = false;
				break;
			}
		}
		if (check) {
			result++;
		}
		factorial(index + 1);
	}
}
