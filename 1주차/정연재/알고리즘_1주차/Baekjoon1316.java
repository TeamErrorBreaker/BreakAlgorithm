package 정연재.알고리즘_1주차;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1316 {
	public static void main(String[] args) {
		// 백준문제 1316번
		// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
		// 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹
		// 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
		// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		// 숫자 입력받기
		int a = sc.nextInt();
		// a개수 만큼의 배열 생성
		String str[] = new String[a];
		// 그룹단어를 세는 개수 count 선언
		int count = 0;
		// a의 숫자만큼 반복
		for (int i = 0; i < a; i++) {
			// 영단어 입력받기
			str[i] = sc.next();
			// 입력한 영단어의 알파벳 수만큼 검사반복
			List<Character> list = new ArrayList<Character>();
			for (int j = 0; j < str[i].length(); j++) {
				// 빈 배열 생성
				if (j != 0) {
					if (str[i].charAt(j) != str[i].charAt(j - 1)) { // -1번째 글자와 일치하지 않을 경우
						for (int k = 0; k < list.size(); k++) {
							// 전의 글자와 다를 경우 --> 그 다음 검사 --> List에 추가되어있는 char들과 비교 있으면 false반환 / 없으면 List에 추가
							// 배열에 들어있는 단어인지 확인
							if (!list.contains(str[i].charAt(j))) { // 저장된 List 중에 일치하는 알파벳이 List에 추가
								list.add(str[i].charAt(j));
							}
						}
					} else {
						list.add(str[i].charAt(j));
					}
				} else { // 검사하는 자리가 첫번째일 경우는 무조건 배열 첫번째에 저장
					list.add(str[i].charAt(0));
				}
			}
			System.out.println(list);
			if (list.size() == str[i].length()) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}