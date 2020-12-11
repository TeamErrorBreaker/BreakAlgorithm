package 심성헌.알고리즘_6주차;

public class 체육복_프로그래머스_그리디 {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 3 };
		int result = solution(n, lost, reserve);

		System.out.println("\n" + result);
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		// 학생수만큼 배열 구현
		int[] students = new int[n];
		// reserve 배열은 여분의 체육복을 가지고 있는 학생이다.
		// students 배열의 해당 학생의 체육복 + 1
		for (int idx : reserve) {
			students[idx - 1]++;
		}

		// lost 배열은 체육복을 도난 당한 학생이다.
		// students 배열의 해당 학생의 체육복 - 1
		for (int idx : lost) {
			students[idx - 1]--;
		}

		// 학생수 만큼 반복한다.
		for (int i = 0; i < students.length; i++) {
			int p = i + 1; // 현재 위치의 + 1
			int m = i - 1; // 현재 위치의 - 1
			// 현재 학생이 여분을 가지고 있다면
			if (students[i] == 1) {
				// 현재 학생 이전의 학생부터 확인
				if (m >= 0) {
					if (students[m] == -1) {
						students[i] = 0;
						students[m] = 0;
					}
				}
				// 현재 학생 다음의 학생 확인
				if (p < students.length) {
					if (students[p] == -1 && students[i] != 0) {
						students[i] = 0;
						students[p] = 0;
					}
				}
			}
		}

		// 체육복을 입고 수업에 참여할 수 있는 학생의 수
		int cnt = 0;
		for (int a : students) {
			System.out.print(a + " ");
			if (a > -1)
				cnt++;
		}
		return cnt;
	}
}
