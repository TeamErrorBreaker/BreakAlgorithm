package 모바일리더_코딩테스트_01;

public class question_04 {
	public int solution(int[] arr, int K) {
		// 여기에 코드를 작성해주세요.
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int k = i + 1; k < arr.length - 1; k++) {
				for (int t = k + 1; t < arr.length; t++) {
					System.out.print("arr[" + i + "] = " + arr[i] + "  ");
					System.out.print("arr[" + k + "] = " + arr[k] + "  ");
					System.out.print("arr[" + t + "] = " + arr[t] + " / ");
					System.out.println(arr[i] + arr[k] + arr[t]);
					if ((arr[i] + arr[k] + arr[t]) % K == 0) {
						answer++;
					}
				}
			}
		}
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		question_04 sol = new question_04();
		int[] arr = { 1, 2, 3, 4, 5 };
		int K = 3;
		int ret = sol.solution(arr, K);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
