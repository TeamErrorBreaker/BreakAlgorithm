package 정연재.알고리즘_3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hanoi {

	static int ans = 0;	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sb.readLine());
		
		System.out.println(ans);
		hanoi(n,1,3,2);//처음 실행할 함수 4번 도형을 1->3으로 이동(2를 이용)
	}
	public static void hanoi(int n,int start, int to,int by) {
		ans++;
		if(n==1) {
			System.out.println(start+" "+to);
			return;
		}
		hanoi(n-1,start,by,to);//3번 도형을 1->2로 이동 (3을 이용)
		System.out.println(start+" "+to);
		hanoi(n-1,by,to,start);
	}
}
