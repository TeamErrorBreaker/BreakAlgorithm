package 모바일리더_코딩테스트_01;

public class question_05 {
	// 다음과 같이 import를 사용할 수 있습니다.

	public int solution(int[] arr) {
		// 여기에 코드를 작성해주세요.
		int count = 0;
		int answer = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int save = arr[i];
			for (int k = i; k < arr.length; k++) {
				if (save < arr[k]) {
					count++;
					save = arr[k];
				} else if (save >= arr[k]) {
					answer = count;
					count = 0;
				}
			}
		}
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		question_05 sol = new question_05();
		int[] arr = { 3, 1, 2, 4, 5, 1, 2, 2, 3, 4 };
		int ret = sol.solution(arr);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
