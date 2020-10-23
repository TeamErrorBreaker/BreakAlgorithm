package 정연재.알고리즘_3주차;

import java.io.IOException;
import java.util.Scanner;

public class 덩치문제_7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//완전 탐색 문제 (백준-7568번)
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);//scanner를이용한 문제풀이
		int cnt = sc.nextInt();
		
		int[][] person = new int[cnt][2];//cnt개수만큼 배열 생성 그 안의 배열은 키 몸무게 = 2개
		int rank[] = new int[cnt];//등수를 입력할 배열
		
		for(int i=0;i<person.length;i++) {
			person[i][0] = sc.nextInt();//몸무게
			person[i][1] = sc.nextInt();//키
			rank[i] = 1;//등수를 전부 1등이라고 선언
		}
		
		for(int i=0;i<person.length;i++) {//비교할 기준이 되는 번호
			for(int j=0;j<person.length;j++) {//비교할 대상이 되는 번호
				if(person[i][0] > person[j][0] && person[i][1] > person[j][1]) {
					rank[j]++;
				}
			}
		}
		for(int i=0;i<person.length;i++) {
			System.out.print(rank[i]+" ");
		}
	}
}
