package 심성헌.알고리즘_3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 덩치_7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		int[][] people = new int[n][2];

		StringTokenizer[] st = new StringTokenizer[n];
		for (int i = 0; i < n; i++) {
			int m = 0;
			st[i] = new StringTokenizer(br.readLine(), " ");
			while (st[i].hasMoreTokens()) {
				people[i][m] = Integer.parseInt(st[i].nextToken());
				m++;
			}

		}

		for (int i = 0; i < people.length; i++) {
			int rank = 1;
			for (int k = 0; k < people.length; k++) {
				boolean check = (people[i][0] < people[k][0]) && (people[i][1] < people[k][1]) &&(i != k);
				if (check) {
					rank++;
				}
			}
			sb.append(rank + " ");
		}
		System.out.println(sb.toString());
	}

}
