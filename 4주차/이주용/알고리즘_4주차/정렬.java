package 이주용.알고리즘_4주차;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 정렬 {

public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int size = Integer.parseInt(br.readLine());

		int[] num = new int[size];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
//		for(int i = 0; i < num.length; i++) {
//			
//			int min = i;
//			
//			for(int j = i+1; j < num.length; j++) {
//				if (num[min] > num[j]) {
//					min = j;
//				}
//			}
//			int temp = num[i];
//			num[i] = num[min];
//			num[min] = temp;
//		}
		
		for(int i = 1; i < num.length; i++) {
			for(int j = i; j > 0; j--) {
				if (num[j] < num[j-1]) {
					int temp = num[j];
					num[j] = num[j - 1];
					num[j - 1] = temp;
				}
			}
		}
		
//		Arrays.sort(num);
		
		for(int i = 0; i <num.length; i++) {
			sb.append(num[i] + "\n");
			
//			bw.write(String.valueOf(num[i]));
//			bw.newLine();
		}
//		bw.close();
	}
	
}
