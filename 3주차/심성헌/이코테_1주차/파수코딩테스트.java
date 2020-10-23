package 심성헌.이코테_1주차;

import java.util.Scanner;

public class 파수코딩테스트 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] v = new int[3][2];

		for (int i = 0; i < v.length; i++) {
			for (int k = 0; k < v[i].length; k++) {
				v[i][k] = sc.nextInt();
			}

		}

		int x;
		int y;

		if (v[0][0] == v[2][0]) {
			x = v[1][0];
		} else if (v[1][0] == v[2][0]) {
			x = v[0][0];
		} else {
			x = v[2][0];
		}
		
		

		sc.close();

	}

}
