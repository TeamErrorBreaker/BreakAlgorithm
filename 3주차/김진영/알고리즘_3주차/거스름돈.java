package 김진영.알고리즘_3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int price = Integer.parseInt(br.readLine());
		int target = 1000 - price;
		
		int count = 0;
		
		while(target>=500) {
			target = target-500;
			count++;
		}
		
		while(target>=100) {
			target = target-100;
			count++;			
		}
		
		while(target>=50) {
			target = target-50;
			count++;	
		}
		
		while(target>=10) {
			target = target-10;
			count++;			
		}
		
		while(target>=5) {
			target = target-5;
			count++;			
		}
		
		while(target!=0) {
			target = target-1;
			count++;			
		}
		
		System.out.println(count);
	}
}
