package 심성헌.알고리즘_2주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열_1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		Stack<Integer> stack = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		int m = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			stack.push(i + 1);
			sb.append("+ \n");
			while (!stack.isEmpty() && stack.peek() == arr[m]) {
				stack.pop();
				sb.append("- \n");
				m++;
			}

		}
		if (!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			System.out.println(sb.toString());
		}

	}

}
