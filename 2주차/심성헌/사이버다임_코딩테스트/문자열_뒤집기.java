package 심성헌.사이버다임_코딩테스트;

import java.util.Scanner;

public class 문자열_뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer result = new StringBuffer();

		System.out.print("str = ");
		String str = sc.next();

		for (int i = str.length() - 1; i >= 0; i--) {
			result.append(str.charAt(i));
		}

		System.out.println("result : " + result);
		sc.close();
	}
}
