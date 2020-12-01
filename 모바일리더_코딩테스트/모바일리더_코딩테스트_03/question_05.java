package 모바일리더_코딩테스트_03;

public class question_05 {
	
	// 시간을 계산해서 딱 필요한 반복만 하기 때문에 시간 복잡도 O(time)
	public String solution(String phrases, int second) {
		// 0. 시간을 계산한다.
		// 1) 모든 글자가 출력되는데 걸리는 시간 = 14초
		// 2) 모든 글자가 출력되고 지워지는데 걸리는 시간 = 28초
		// 3) 1) ~2)를 반복하고 첫 글자가 출력되는데 걸리는 시간 = 29초
		// 즉, 글자가 출력되는 개수는 시간을 통해 계산할 수 있다.
		// 14자를 초과하면 나머지 값이 출력 글자 개수, 14자 이하라면 시간 자체가 출력 글자 개수이다.
		int time = second;
		if (time > 14) {
			time = second % 14;
		}
		// 1. 화면에 출력할 14크기의 배열 생성
		// -> 시간만큼의 인덱스들은 데이터를 넣지 않는다.
		char[] lcd = new char[14];
		for (int i = 0; i < lcd.length - time; i++) {
			lcd[i] = '_';
		}
		// 2. 입력 문구 배열로 변환
		char[] txt = phrases.toCharArray();

		// 3. 빈칸을 채워 넣는다.
		int idx = 0;
		for (int i = lcd.length - time; i < lcd.length; i++, idx++) {
			lcd[i] = txt[idx];
		}

		String answer = String.valueOf(lcd);
		return answer;
	}

	// 주어진 시간만큼 반복하기에 시간복잡도 O(second)
	public String solution2(String phrases, int second) {
		String answer = "";
		String display = "";
		display = "______________" + phrases;
		for (int i = 0; i < second; ++i) {
			display = display + Character.toString(display.charAt(0));
//			System.out.println(display);
			display = display.substring(1);
//			System.out.println(display);
		}
		answer = display.substring(0, 14);
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		question_05 sol = new question_05();
		String phrases = new String("happy-birthday");
		int second = 99999999;
		String ret = sol.solution(phrases, second);
		String ret2 = sol.solution2(phrases, second);
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");		
	}
}
