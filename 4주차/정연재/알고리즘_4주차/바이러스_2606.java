package 정연재.알고리즘_4주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 바이러스_2606 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static int cnt;
	private static int connect;
	private static int n[][];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		cnt = Integer.parseInt(br.readLine());//총 컴퓨터 개수
		connect = Integer.parseInt(br.readLine());//총 연결 개수
		
		n = new int[cnt][connect];
		
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<connect;j++) {
				n[i][j] = Integer.parseInt(br.readLine());
			}
		}
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<connect;j++) {
				System.out.println(n[i][j]);
			}
		}
	}
}
