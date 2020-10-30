package 정연재.알고리즘_4주차;

import java.io.IOException;
import java.util.Scanner;

public class 정렬_17074 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();//배열의 길이 선언
		int arr[] = new int[cnt];
		int count = 0;//감소하는 부분 count할 변수 선언
		int tmp = 0;
		
		for(int i=0;i<cnt;i++) {
			arr[i] = sc.nextInt();//배열 안에 숫자 넣기
		}
		for(int i=1;i<cnt;i++) {
			if(arr[i]>arr[i+1]) {
				count++;
				tmp = i;
			}
		}
		switch (count) {
		case 0://count(감소하는 부분이 0일 경우 --> 뺼 필요없이 정렬임)
			System.out.println(cnt);
			break;
		case 2://count가 2일 경우 --> 감소하는 부분이 두개 존재 --> 하나만 제외해야 하는데 두개의 감소하는 부분이 있음 --> 하나만 빼서는 정렬을 이룰 수 없음
			System.out.println(0);
			break;
		default:
			if(arr[tmp]==0) {//감소하는 부분이 index번호 0일 경우
				System.out.println(1);
			}else if(arr[tmp] == cnt-2) {//감소하는 부분이 배열의 개수-2일 경우
				
			}
			
			
		}
		
		System.out.println(count);
	}
}