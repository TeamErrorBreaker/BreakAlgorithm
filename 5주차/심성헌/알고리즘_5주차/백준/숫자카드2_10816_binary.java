package 심성헌.알고리즘_5주차.백준;

import java.io.*;
import java.util.*;

public class 숫자카드2_10816_binary {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuffer sb = new StringBuffer();
	static int n, m, count;
	static int[] arr1, arr2;
	static boolean[] check;

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());
		arr1 = new int[n];
		check = new boolean[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		while (st.hasMoreTokens()) {
			arr1[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}

		Arrays.sort(arr1);

		m = Integer.parseInt(br.readLine());
		arr2 = new int[m];

		st = new StringTokenizer(br.readLine());
		cnt = 0;
		while (st.hasMoreTokens()) {
			arr2[cnt] = Integer.parseInt(st.nextToken());
			count = 0;
			card(arr1, 0, n - 1, arr2[cnt]);
			sb.append(count + " ");
			cnt++;
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static void card(int[] arr, int start, int end, int target) {
		if (start > end || start < 0 || end >= n)
			return;
		int mid = (start + end) / 2;
		int mid1 = mid + 1 >= n ? n - 1 : mid + 1;
		int mid2 = mid - 1 < 0 ? 0 : mid - 1;
		if (arr[mid] == target) {
			if (!check[mid]) {
				count++;
				check[mid] = true;
				if (arr[mid2] != target || arr[mid1] == target) {
					card(arr, mid1, end, target);
				} else if (arr[mid2] == target || arr[mid1] != target) {
					card(arr, start, mid2, target);
				}
			}
		} else if (arr[mid] > target) {
			card(arr, start, mid2, target);
		} else {
			card(arr, mid1, end, target);
		}
	}
}
