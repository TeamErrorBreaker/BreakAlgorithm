package 심성헌.알고리즘_6주차;

public class 가운데글자가져오기_프로그래머스 {
	public static void main(String[] args) {
		String s = "qwer";
		String result = solution(s);

		System.out.println(result);
	}

	public static String solution(String s) {
		return s.substring((s.length() - 1) / 2, s.length() / 2 +1);
	}
}
