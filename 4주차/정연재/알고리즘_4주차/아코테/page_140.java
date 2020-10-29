package 정연재.알고리즘_4주차.아코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class page_140 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 public static int n, m;
	 public static int[][] arr = new int[1000][1000];
	
	//확인하는 재귀함수..?
	public static boolean dfs(int x,int y) {
		//만약 주어진 범위를 벗어나면 즉시 종료
		if( x <=-1 || x >= n || y <= -1 || y >= m ) {
			return false;
		}
		//현재 노드를 아직 방문하지 않았다면
		if( arr[x][y] == 0 ) {
			
			//해당 노드 방문처리
			arr[x][y] = 1;
			
			//해당 노드의 상,하,좌,우 재귀 처리
			dfs(x - 1, y);//좌?
            dfs(x, y - 1);//하?
            dfs(x + 1, y);//우?
            dfs(x, y + 1);//상?
			
			return true;
		}
		
		return false;
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		arr = new int[n][m];
		
		for(int i = 0;i<n;i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				//int형인 arr에 charAt을 하면 ASCII코드로 변환해 48,49로 출력된다
				//이를 방지하기 위해 -'0'을 붙여주어 정수로 변환한다.
                arr[i][j] = str.charAt(j) - '0';
            }
		}
		
		int cnt = 0;
		for(int i=0;i< arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				boolean check = dfs(i,j);
				if(check) {
					cnt ++;
					
				}
			}
		}
		System.out.println(cnt);
	}
}
