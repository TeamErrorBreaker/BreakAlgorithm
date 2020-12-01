package 모바일리더_코딩테스트_01;

import java.util.*;

public class question_06 {

	public int[] solution(String commands) {
		// 여기에 코드를 작성해주세요.
		String[] arr = new String[commands.length()];
		int[] xy = { 0, 0 };
		for (int i = 0; i < commands.length(); i++) {
			arr[i] = String.valueOf(commands.charAt(i));
			switch (arr[i]) {
			case "L":
				xy[0] -= 1;
				break;
			case "R":
				xy[0] += 1;
				break;
			case "U":
				xy[1] += 1;
				break;
			case "D":
				xy[1] -= 1;
			default:
				break;
			}
		}
		return xy;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		question_06 sol = new question_06();
		String commands = "URDDL";
		int[] ret = sol.solution(commands);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
	}
}
