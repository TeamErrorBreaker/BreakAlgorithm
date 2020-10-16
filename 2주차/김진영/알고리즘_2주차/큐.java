package 김진영.알고리즘_2주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 큐 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0; i<size; i++) {
			queue.offer(i+1);
		}
		
		int[] num = new int[size-1];
		
//		for(int i=0; i<size-1; i++) {
//			// 1. 첫번째를 버린다
//			num[i] = queue.poll();
//			
//			if(queue.size()==1) {
//				break;
//			}
//
//			// 2. 그 다음 수를 맨 뒤로 보낸다
//			int nextNum = queue.poll();
//			queue.offer(nextNum);
//		}
		
		while(queue.size()!=1) {
			// 1. 첫번째를 버린다
			queue.poll();
			
			// 2. 그 다음 수를 맨 뒤로 보낸다
			int nextNum = queue.poll();
			queue.offer(nextNum);
		}
		
		System.out.println(queue.poll());
		
	}
}
