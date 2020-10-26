package 심성헌.파수;

import java.util.Stack;

public class 괄호짝짓기 {

	public static void main(String[] args) {

		String str = "{cpp{ja{v}a}}{phyton}";
		int[] idx = { 0, 4, 7, 9, 10, 11, 12, 13, 20 };
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (String.valueOf(str.charAt(i)).equals("{") || String.valueOf(str.charAt(i)).equals("}")) {
				count++;
			}

		}

		int[] list = new int[count];
		Stack<Integer> stack = new Stack<Integer>();
		count = 0;

		for (int i = 0; i < idx.length; i++) {
			System.out.println("i : " + i);
			if (String.valueOf(str.charAt(idx[i])).equals("{")) {
				for (int k = idx[i]; k < str.length(); k++) {
					System.out.println("k : " + k);
					if (String.valueOf(str.charAt(k)).equals("{")) {
						stack.push(k);
					} else if (String.valueOf(str.charAt(k)).equals("}")) {
						stack.pop();
					}
					if (stack.isEmpty()) {
						list[count] = k;
						count++;
						break;
					}
				}
			}
			if (String.valueOf(str.charAt(idx[i])).equals("}")) {
				for (int k = idx[i]; k > -1; k--) {
					System.out.println("k : " + k);
					if (String.valueOf(str.charAt(k)).equals("}")) {
						stack.push(k);
					} else if (String.valueOf(str.charAt(k)).equals("{")) {
						stack.pop();
					}
					if (stack.isEmpty()) {
						list[count] = k;
						count++;
						break;
					}
				}
			}
			System.out.println("----");
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
