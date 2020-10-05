package 정연재.알고리즘_1주차;

import java.util.Scanner;

public class Quiz01 {
	//1주차 알고리즘 문제 
	//문제 : 백준  2439문제
	//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	public static void main(String[] args) {
		//숫자입력을 위한 입력창
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 : ");
		int input = sc.nextInt();
		//입력한 개수만큼 반복
		for(int i=0; i<input; i++) {
			//공백 출력 반복하기(공백이 나와서 오른쪽 정렬이 되어야 하므로 입력값에서 i만큼을 뺸 값을 공백반복)
			for(int j=1;j<input-i;j++) {
				System.out.print(" ");
			}
			//반복한 개수만큼 별찍기(+1을 안하면 -1까지의 값이 나오기 때문에 +1을 해줌 왠지는 모름) 
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
