package 이주용.알고리즘_2주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소_최대 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int min = 1000000;
		int max = -1000000;
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			if(min > num) {
				min = num;
			}
			
			if(max < num) {
				max = num;
			}
		}
		
		System.out.println(min + " " + max);
		
	}

}
