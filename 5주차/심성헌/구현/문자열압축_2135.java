package 심성헌.구현;

import java.io.*;

public class 문자열압축_2135 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String n;
	static int sum = 1;
	static int cnt = 1;

	public static void main(String[] args) throws Exception {
		n = br.readLine();

		for (int i = 0; i < n.length(); i++) {
			for (int k = i + 1; k < n.length() / 2 + 1; k++) {
				System.out.println(n.substring(i, k));
				String sub1 = n.substring(i, k);

				for (int t = k; t < n.length(); t++) {
					int end = (k - i) + t > n.length() ? n.length() : (k - i) + t;
					String sub2 = n.substring(t, end);
					if (sub2.length() == sub1.length()) {
						System.out.print(n.substring(t, end) + " ");
						if (sub1.equals(sub2)) {
							sum += cnt;
						} 
					}
				}
				System.out.println();
				System.out.println(sum);
			}
		}
	}
}
