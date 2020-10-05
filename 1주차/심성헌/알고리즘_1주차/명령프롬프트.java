package 심성헌.알고리즘_1주차;

import java.util.Scanner;

public class 명령프롬프트 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer keyword = new StringBuffer();

		int n = sc.nextInt(); // 검색할 데이터 이름의 개수
		String[] list = new String[n];

		for (int i = 0; i < n; i++) {
			list[i] = sc.next(); // 검색할 데이터만큼 이름 추가
		}
		keyword.append(list[0]);
		for (int i = 1; i < n; i++) {
			for (int k = 0; k < list[0].length(); k++) {
				if (keyword.charAt(k) != list[i].charAt(k)) {
					int start = k;
					int end = k + 1;
					keyword.replace(start, end, "?");
				}
			}
		}
		System.out.println(keyword);
		sc.close();
	}
}
