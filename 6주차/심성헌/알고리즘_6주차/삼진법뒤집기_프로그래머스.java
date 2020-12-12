package 심성헌.알고리즘_6주차;

public class 삼진법뒤집기_프로그래머스 {
	public static void main(String[] args) {
		int n = 125;
		int result = solution(n);

		System.out.println(result);
	}

	public static int solution(int n) {
		int tmp = n;
		StringBuffer sb = new StringBuffer();
		while (tmp > 0) {
			int remain = tmp % 3;
			sb.append(remain);
			tmp /= 3;
		}
		int score = 0;
		int x = sb.length() - 1;
		for (int i = 0; i < sb.length(); i++) {
			score += Integer.parseInt(sb.toString().substring(i, i + 1)) * Math.pow(3, x);
			x--;
		}
		return score;
	}
}
