package 심성헌.구현;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 문자열압축_이코테 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String n;

	public static void main(String[] args) throws Exception {
		n = br.readLine();
		int length = n.length() / 2 + 1;
		int min = n.length();

		for (int i = 1; i < length; i++) {
			String before = "";
			int sum = 0;
			int cnt = 1;
			for (int k = 0; k < n.length();) {
				int start = k;
				System.out.println("start = " + start);
				k = i + k > n.length() ? n.length() : i + k;
				System.out.println("k = " + k);
				String tmp = n.substring(start, k);
				System.out.println(tmp);
				if (tmp.equals(before)) {
					cnt++;
				} else {
					if (cnt != 1)
						sum += (int) Math.log10(cnt) + 1;
					cnt = 1;
					sum += before.length();
					before = tmp;
				}
			}
			if (cnt != 1)
				sum += (int) Math.log10(cnt) + 1;
			sum += before.length();
			min = min > sum ? sum : min;
			System.out.println("min = " + min);
			System.out.println("-------------------");
		}
		System.out.println(min);
	}
}
