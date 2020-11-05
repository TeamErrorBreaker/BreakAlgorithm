package 이주용.알고리즘_2주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 큐_카드2 {
	
	public static void main(String[] args) throws Exception, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 1; i <= num; i++) {
			queue.offer(i);
		}
		
		while(queue.size() != 1) {
			queue.poll();
			queue.offer(queue.poll());
			
		}

		System.out.println(queue.peek());
		
	}

}
