package 심성헌.알고리즘_5주차.백준;

import java.io.*;
import java.util.*;

public class X와K_1322 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		String[] input = br.readLine().split(" ");
		long x = Long.parseLong(input[0]);
		long k = Long.parseLong(input[1]);
		long save = 1;
		long result = 0;
		ArrayList<Long> arr = new ArrayList<Long>();

		while ((long) Math.pow(2, arr.size()) <= k) {
			if ((x | save) != x) {
				arr.add(save);
			}
			save *= 2;
		}

		for (int i = arr.size() - 1; i >= 0; i--) {
			if (k == 0) {
				break;
			} else {
				if ((long) Math.pow(2, i) <= k) {
					result += arr.get(i);
					k -= (long) Math.pow(2, i);
				}
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
