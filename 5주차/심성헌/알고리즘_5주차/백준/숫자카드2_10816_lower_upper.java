package 심성헌.알고리즘_5주차.백준;

import java.io.*;
import java.util.*;

// https://jackpot53.tistory.com/33
// https://12bme.tistory.com/120
public class 숫자카드2_10816_lower_upper {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuffer sb = new StringBuffer();
	static int n, m;
	static int upperIdx;
	static int[] arr1 = new int[20000001];
	static int[] arr2 = new int[20000001];

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		while (st.hasMoreTokens()) {
			arr1[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}

		Arrays.sort(arr1);

		m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		cnt = 0;
		while (st.hasMoreTokens()) {
			arr2[cnt] = Integer.parseInt(st.nextToken());
			int idx = lowerbound(arr1, arr2[cnt]);
			upperIdx = 0;
			if (arr2[cnt] == arr1[idx]) {
				upperIdx = upperbound(arr1, arr2[cnt]);
				upperIdx = upperIdx - idx;
			}
			sb.append(upperIdx + " ");
		}
		bw.write(sb.toString());
		bw.flush();
	}

	public static int lowerbound(int[] arr, int target) {
		int lower = 0;
		int upper = arr1.length;
		while (lower < upper) {
			int mid = lower + (upper - lower) / 2;
			if (target <= arr1[mid]) {
				upper = mid;
			} else {
				lower = mid + 1;
			}
		}
		return lower;
	}

	public static int upperbound(int[] arr, int target) {
		int lower = 0;
		int upper = arr1.length;
		while (lower < upper) {
			int mid = lower + (upper - lower) / 2;
			if (target >= arr[mid]) {
				lower = mid + 1;
			} else {
				upper = mid;
			}
		}
		return lower;
	}
}
