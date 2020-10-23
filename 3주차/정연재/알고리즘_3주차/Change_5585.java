package 정연재.알고리즘_3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change_5585 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 거스름돈 알고리즘
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pay = Integer.parseInt(br.readLine());
		int coin[] = {500,100,50,10,5,1};
		int count = 0;
		int change = 1000 - pay;
		for(int i=0;i<coin.length;i++) {
			count += change / coin[i];
			change = change % coin[i];
		}
		System.out.println(count);
	}
}
