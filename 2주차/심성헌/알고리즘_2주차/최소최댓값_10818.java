package 심성헌.알고리즘_2주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최댓값_10818 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer.parseInt(br.readLine()); // 배열의 길이

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int min = 1000001;
		int max = -1000001;

		while (st.hasMoreTokens()) {

			int value = Integer.parseInt(st.nextToken());

			if (max < value)
				max = value;

			if (min > value)
				min = value;
		}
		System.out.println(min + " " + max);
	}

}
