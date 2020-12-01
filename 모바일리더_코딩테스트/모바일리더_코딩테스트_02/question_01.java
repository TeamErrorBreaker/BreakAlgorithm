package 모바일리더_코딩테스트_02;

public class question_01 {
	public long solution(long num) {
		// Write code here.
		String n = String.valueOf(num + 1);
		n = n.replace('0', '1');

		long answer = Long.parseLong(n);
		return answer;
	}

	// The following is main method to output testcase.
	public static void main(String[] args) {
		question_01 sol = new question_01();
		long num = 9949999;
		long ret = sol.solution(num);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret + " .");
	}
}
