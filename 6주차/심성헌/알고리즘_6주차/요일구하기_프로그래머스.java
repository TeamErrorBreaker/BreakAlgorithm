package 심성헌.알고리즘_6주차;

public class 요일구하기_프로그래머스 {
	public static void main(String[] args) {
		int a = 5, b = 24;
		String result = solution(a, b);

		System.out.println(result);
	}

	public static String solution(int a, int b) {
		// 2016년 특정 날짜의 요일을 구하라.
		// 2016년은 윤년이다.
		// 2016년 1월 1일은 금요일이다.
		String[] today = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] day = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int cnt = 0;
		for (int month = 0; month < a; month++) {
			for (int i = 1; i <= day[month]; i++) {
				if (month == (a - 1) && i == b)
					break;
				cnt++;
			}
		}
		return today[cnt % 7];
	}
}
