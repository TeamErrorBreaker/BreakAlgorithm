package 심성헌.알고리즘_5주차.이코테;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부품찾기_이코테 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, m;
	static int[] arr1, arr2;

	public static void main(String[] args) throws Exception {
		// N = 물건의 개수 / M = 내가 찾는 물건의 개수
		// N 입력
		n = Integer.parseInt(br.readLine());
		arr1 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int idx = 0;
		while (st.hasMoreTokens()) {
			arr1[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}

		// M 입력
		m = Integer.parseInt(br.readLine());
		arr2 = new int[m];
		st = new StringTokenizer(br.readLine());
		idx = 0;
		while (st.hasMoreTokens()) {
			arr2[idx] = Integer.parseInt(st.nextToken());
			System.out.print(find(arr1, 0, n - 1, arr2[idx]) + " ");
			idx++;
		}
	}

	public static String find(int[] arr, int start, int end, int target) {
		if (start > end) return "No";
		int mid = (start + end) / 2;
		if (arr[mid] == target) return "Yes";
		else if (arr[mid] > target) return find(arr, start, mid - 1, target);
		else return find(arr, mid + 1, end, target);
	}
}
