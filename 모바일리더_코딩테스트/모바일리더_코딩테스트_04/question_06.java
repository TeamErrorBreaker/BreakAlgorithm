package 모바일리더_코딩테스트_04;

import java.util.*;

public class question_06 {
	public int power(int base, int exponent) {
		int val = 1;
		for (int i = 0; i < exponent; i++) {
			val *= base;
		}
		return val;
	}

	public int[] solution(int k) {
		// k를 통해 최대 범위를 구한다.
		int range = power(10, k);
		int[] answer = new int[range];
		int count = 0;
		// 나르시시즘 수는 range 범위 안에 존재한다.
		for (int i = range / 10; i < range; i++) {
			int current = i;
			int cal = 0;
			// i에 대한 각 자리수의 k제곱 값을 구한다.
			// 각 자리수의 k제곱 값을 모두 합한 값 == cal 이다.
			while(current != 0) {
				cal += power(current % 10, k);
				current /= 10;
			}
			
			// i에 대한 각 자리수의 k제곱 값을 모두 합한 값이
			// i와 같다면 그 수는 나르시시즘 수이다.
			if(cal == i) {
				answer[count] = i;
				count++;
			}
		}
		int[] ret = new int[count];
		for(int i = 0; i < count; i++) {
			ret[i] = answer[i];
		}
		return ret;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		question_06 sol = new question_06();
		int k = 5;
		int[] ret = sol.solution(k);

		// 실행] 버튼을 누르면 출력값을 볼 수 있습니다.
		System.out.printf("solution 메소드의 반환 값은 ");
		System.out.printf(Arrays.toString(ret));
		System.out.printf(" 입니다.\n");
	}
}
