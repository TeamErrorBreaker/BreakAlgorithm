package 심성헌.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문자열재정렬_이코테 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuffer sb = new StringBuffer();
	static char[] arr;
	static int num;

	public static void main(String[] args) throws Exception {

		arr = br.readLine().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int k = i; k < arr.length; k++) {
				if(arr[i] > arr[k]) {
					char save = arr[i];
					arr[i] = arr[k];
					arr[k] = save;
				}
			}
			if (arr[i] >= '0' && arr[i] <= '9') {
				num += (arr[i] - '0');
			} else {
				sb.append(arr[i]);
			}
		}
		
		sb.append(num);
		System.out.println(sb.toString());
	}
}
