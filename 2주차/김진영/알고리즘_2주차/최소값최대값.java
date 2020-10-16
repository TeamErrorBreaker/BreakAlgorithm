package 김진영.알고리즘_2주차;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 최소값최대값 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int size = Integer.parseInt(br.readLine());
		
		// 한 줄씩 읽어오기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = -1000000;
		int min = 1000000;
		
		// 개수만큼 반복문 돌리기
		for(int i=0; i<size; i++) {
			int number = Integer.parseInt(st.nextToken()); // 읽어온 줄의 첫번째 숫자
			if(max < number) max = number; // max보다 크면 max 값으로 설정
			if(min > number) min = number; // min보다 작으면 min 값으로 설정
		}
		
		br.close();
		
		// 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(min+" "+max);
		
		bw.close();
	}
}
