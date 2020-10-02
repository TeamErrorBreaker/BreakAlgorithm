package 심성헌.알고리즘_1주차;

import java.util.Scanner;

public class 그룹단어 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //문자열 배열의 길이 입력
		int result = n; // 검사 전 그룹 단어 갯수
		boolean check = true; // 검사 도구

		String[] word = new String[n]; // 문자열 배열 길이 설정
		
		// 문자열 배열 길이만큼 각 인덱스 데이터 삽입
		for (int i = 0; i < word.length; i++) {
			word[i] = sc.next();
		}

		// 배열 인덱스 순으로
		for (int i = 0; i < word.length; i++) {

			// 해당 인덱스의 문자열 한 글자씩 검사
			for (int k = 0; k < word[i].length(); k++) {
				
				check = true; // 다시 돌아왔을 때 검사 도구 초기화
				char thisChar = word[i].charAt(k); // 현재 글자
				int last = word[i].lastIndexOf(thisChar); // 현재 글자의 마지막에 위치한 인덱스 번호

				// 현재 글자와 마지막 글자 사이에 다른 글자가 있는지 체크를 위해 반복
				// 만약 다른 글자가 있다면 그룹 단어가 아니다.
				for (int t = k + 1; t < last; t++) {
					char compareChar = word[i].charAt(t); // 현재 글자와 비교할 사이 단어

					// 현재 글자의 인덱스 번호와 현재 글자의 마지막 인덱스 번호 사이에 
					// 동일하지 않은 글자가 있다면 현재의 반복문 중지!
					if (thisChar != compareChar) {
						check = false;
					}
				}
				// 해당 인덱스의 문자열이 그룹 단어가 아니라면 해당 반복문 break 해라.
				// 그리고 그룹 단위 갯수에서 -1 해라.
				if (check == false) {
					result--;
					break;
				}
			}
		}
		// 결과
		System.out.println(result);
		sc.close();
	}

}