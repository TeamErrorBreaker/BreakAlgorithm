package 정연재.알고리즘_3주차;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Change_5585 {
	public static void main(String[] args) {
		// 거스름돈 알고리즘
		Scanner sc = new Scanner(System.in);

		int max = 1000;//최댓값
		int min = 1;//최소값
		
		int pay = sc.nextInt();
		int coin[] = {500,100,10,5,1};
		int count = 0;
		int change = 1000 - pay;
		if(pay > min && pay < max) {
			for(int i=0;i<coin.length;i++) {
				count += change / coin[i];
				change = change % coin[i];
			}
		}
		System.out.println(count);
	}
}
