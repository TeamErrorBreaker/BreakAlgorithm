package 이주용.알고리즘_5주차;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class 단지번호붙이기 {

//	static int dx[] = {-1, 1, 0, 0};
//	static int dy[] = {0, 0, -1, 1};
	
	static int[][] map;
	static ArrayList<Integer> home = new ArrayList<>();
	static int inputSize, count, homeCount;
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		inputSize = Integer.parseInt(br.readLine());
		map = new int[inputSize][inputSize];
		
		
		for(int i = 0; i < inputSize; i++) {
			String input = br.readLine();
			for(int j = 0; j < inputSize; j++) {
				map[i][j] = input.charAt(j) - '0';
			}
		}
		
		
		for(int i = 0; i < inputSize; i++) {
			for(int j = 0; j < inputSize; j++) {
				if(dfs(i, j) == true) {
					count++;
					home.add(homeCount);
					homeCount=0;
				}
			}
		}

//		for(int i = 0; i < inputSize; i++) {
//			for(int j = 0; j < inputSize; j++) {
//				if(map[i][j] == 1) {
//					homeCount=1;
//					count++;
//					dfs(i, j);
//					home.add(homeCount);
//				}
//			}
//		}
		
		Collections.sort(home);
		bw.write(count + "\n");
		for(int i = 0; i < home.size(); i++) {
			bw.write(home.get(i) + "\n");
		}
		bw.flush();
		bw.close();

		
	}

	public static boolean dfs(int x, int y) {
		boolean isDFS = x < 0 || x >= inputSize || y < 0 || y >= inputSize;
		if(isDFS) return false;
		
		if(map[x][y] == 1) {
			map[x][y] = 0;
			
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y - 1);
			dfs(x, y + 1);
			
			homeCount++;
			return true;
		}
		return false;
	}
	
//	public static void dfs(int x, int y) {
//		map[x][y] = 0;
//		
//		for(int i = 0; i < 4; i++) {
//			int nx = x + dx[i];
//			int ny =y + dy[i];
//			
//			boolean isDFS = nx < 0 || nx >= inputSize || ny < 0 || ny >= inputSize;
//			
//			if (!isDFS && map[nx][ny] == 1) {
//				
//				dfs(nx, ny);
//				
//				homeCount++;
//			}
//		
//		}
//		
//	}
	
	
	
}
