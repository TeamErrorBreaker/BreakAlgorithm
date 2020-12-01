package 모바일리더_코딩테스트_02;

public class question_07 {
	int solution(int[] prices) {
		int INF = 1000000001;
		int tmp = INF;
		int answer = -INF;
		for (int price : prices) {
			if (tmp != INF)
				answer = Math.max(answer, price - tmp);
			tmp = Math.min(tmp, price);
		}
		return answer;
	}

	// The following is main method to output testcase. The main method is correct
	// and you shall correct solution method.
	public static void main(String[] args) {
		question_07 sol = new question_07();
		int[] prices1 = { 1, 2, 3 };
		int ret1 = sol.solution(prices1);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret1 + " .");

		int[] prices2 = { 3, 1 };
		int ret2 = sol.solution(prices2);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret2 + " .");
	}
}
