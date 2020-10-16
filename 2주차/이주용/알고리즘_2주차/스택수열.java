package 이주용.알고리즘_2주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class 스택수열 {

public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();
		
		int index = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i = 1; i <= size; i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(num);
			stack.push(i);
			sb.append("+\n");
			
			while(stack.peek() == list.get(index)) {
				stack.pop();
				list.remove(index);
				sb.append("-\n");
				if(stack.isEmpty()) {
					break;
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println(sb);
		}
		else {
			System.out.println("NO");
		}
	}
	
}
