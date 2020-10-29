package 정연재.알고리즘_4주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기_2750 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		int list[] = new int[input];
		
//		N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		for(int i=0;i<input;i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<list.length;i++) {
			for(int j=i;j<list.length;j++) {
				if(list[j]<list[i]) {
					int a = list[j];
					list[j] = list[i];
					list[i] = a;
				}
			}
		}
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
	}
}
