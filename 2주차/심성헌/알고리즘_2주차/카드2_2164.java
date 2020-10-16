package 심성헌.알고리즘_2주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2_2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> q = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
				q.offer(i);
		}

		while (q.size() > 1) {
			q.poll();
			q.offer(q.peek());
			q.poll();
		}

		for(int i : q) {
			System.out.println(i);
		}
		
	}

}
