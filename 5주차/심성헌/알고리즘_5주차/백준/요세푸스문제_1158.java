package 심성헌.알고리즘_5주차.백준;

import java.io.*;
import java.util.*;

public class 요세푸스문제_1158 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuffer sb = new StringBuffer();
	static Queue<Integer> queue = new LinkedList<Integer>();
	static int n, m;

	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int arr[] = new int[n + 1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
			queue.offer(arr[i]);
		}
		String result = turn(arr, m);
		bw.write(result.toString());
		bw.flush();
		bw.close();
	}

	public static String turn(int[] arr, int turn) {
		int cnt = 1;
		sb.append("<");
		while (!queue.isEmpty()) {
			if (cnt == turn) {
				cnt = 1;
				int save = queue.poll();
				sb.append(save);
				if (!queue.isEmpty()) {
					sb.append(", ");
				}
			} else {
				queue.offer(queue.poll());
				cnt++;
			}
		}
		sb.append(">");
		return sb.toString();
	}
}
