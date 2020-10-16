package 김진영.알고리즘_3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 덩치 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		int[]x = new int[size];
		int[]y = new int[size];
		int count = 1;
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer[] st = new StringTokenizer[size];
		
		for(int i=0; i<size; i++) {
			st[i] = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st[i].nextToken());
			y[i] = Integer.parseInt(st[i].nextToken());
//			System.out.println(x[i]+", "+y[i]);
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(x[i] < x[j] && y[i] < y[j]) {
					count++;
				}
			}
			sb.append(count);
			sb.append(" ");
			count = 1;
		}
		
		System.out.println(sb.toString());
	}

}
