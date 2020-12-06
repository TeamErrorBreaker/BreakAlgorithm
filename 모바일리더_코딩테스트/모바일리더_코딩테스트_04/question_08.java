package 모바일리더_코딩테스트_04;

public class question_08 {
	public int solution(int[] card, int n) {

		int[] answer = new int[card.length];
		// 1. 카드 오름차순 버블 정렬
		for (int i = 0; i < card.length; i++) {
			int tmp = card[i];
			for (int k = i + 1; k < card.length - 1; k++) {
				if (tmp > card[k]) {
					card[i] = card[k];
					card[k] = tmp;
					tmp = card[i];
				}
			}
			answer[i] = card[i];
		}

		// 2. 카드 길이만큼 반복하여 가장 작은 수로 만든다.
		for (int i = 0; i < card.length - 1; i++) {
			
		}

		return 0;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		question_08 sol = new question_08();
		int card1[] = { 1, 2, 1, 3 };
		int n1 = 1312;
		int ret1 = sol.solution(card1, n1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int card2[] = { 1, 1, 1, 2 };
		int n2 = 1122;
		int ret2 = sol.solution(card2, n2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
