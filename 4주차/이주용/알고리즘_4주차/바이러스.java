package 이주용.알고리즘_4주차;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스 {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	// 노드 개수 배열로 선언
	public static boolean[] node;
	
	// 링크 수 2차원 리스트로 선언 
	public static ArrayList<ArrayList<Integer>> link = new ArrayList<ArrayList<Integer>>();
	public static StringBuffer sb = new StringBuffer();

	
	// bfs 탐색
	public static void bfs(int start) {
		
		// 결과 출력 변수 선언
		int count = 0;
		
		Queue<Integer> q = new LinkedList<>();
		
		// 시작 노드 큐에 삽입
		q.offer(start);
		// 노드 방문 상태 변경
		node[start] = true;
		
		// 큐가 비어질 때 지
		while(!q.isEmpty()) {
			int num = q.poll();
			
			// 인접 노드 검사
			for(int i = 0; i < link.get(num).size(); i++) {
				int j = link.get(num).get(i);
				
				// 노트에 방문하지 않았을 시
				if(!node[j]) {
					q.offer(j);
					node[j] = true;
					// 방문한 노드의 개수
					count++;
				}
			}
		}
		
		sb.append(count);
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		// 노드 개수 재 선언(1부터 시작을 위해 +1)
		int n = Integer.parseInt(br.readLine());
		node = new boolean[n+1];

		for(int i = 0; i < n+1; i++) {
			link.add(new ArrayList<Integer>());
		}
		
		// 링크 개수 입력
		int s = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < s; i ++) {
			// 링크 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int no1 = Integer.parseInt(st.nextToken());
				int no2 = Integer.parseInt(st.nextToken());
				System.out.println("no1 : " + no1);
				System.out.println("no2 : " + no2);
				
				// 리스트에 데이터 추가
				link.get(no1).add(no2);
				link.get(no2).add(no1);
				
			}
		}
		bfs(1);
		bw.write(String.valueOf(sb));
		bw.close();
	}

}
