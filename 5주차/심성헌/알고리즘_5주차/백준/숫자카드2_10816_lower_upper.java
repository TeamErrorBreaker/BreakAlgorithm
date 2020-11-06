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
	static int[] arr1;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		arr1 = new int[n];
		while (st.hasMoreTokens()) {
			arr1[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}

		Arrays.sort(arr1);

		m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		cnt = 0;
		while (st.hasMoreTokens()) {
			int target = Integer.parseInt(st.nextToken());
			int result = check(target);
			sb.append(result + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static int check(int target) {
		int lower = lowerbound(target);
		int upper = upperbound(target);

		return upper - lower;
	}

	public static int lowerbound(int target) {
		int lower = 0;
		int upper = n;
		while (lower < upper) {
			int mid = (upper + lower) / 2;
			if (target == arr1[mid]) {
				upper = mid;
			} else if (arr1[mid] > target) {
				upper = mid;
			} else {
				lower = mid + 1;
			}
		}
		return lower;
	}

	public static int upperbound(int target) {
		int lower = 0;
		int upper = n;
		while (lower < upper) {
			int mid = (upper + lower) / 2;
			if (target == arr1[mid]) {
				lower = mid + 1;
			} else if (target < arr1[mid]) {
				upper = mid;
			} else {
				lower = mid + 1;
			}
		}
		return upper;
	}
}
