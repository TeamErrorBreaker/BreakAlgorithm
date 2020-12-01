package 모바일리더_코딩테스트_03;

public class question_01_01 {

	public boolean fun_a(int[] arrA, int[] arrB) {
		int[] arrTmp = new int[1001];
		for (int i = 0; i < arrA.length; i++) {
			arrTmp[arrA[i]]++;
			arrTmp[arrB[i]]--;
		}
		for (int i = 0; i < arrTmp.length; i++) {
			if (arrTmp[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public int[] fun_b(int[] arr) {
		int[] arrTmp = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			arrTmp[i + arr.length] = arrTmp[i] = arr[i];
		}

		return arrTmp;
	}

	public boolean fun_c(int[] arrA, int[] arrB) {
		for (int i = 0; i < arrB.length; i++) {
			int k;
			for (k = 0; k < arrB.length; k++) {
				if (arrA[i + k] != arrB[k])
					break;
			}
			if (k == arrB.length) {
				return true;
			}
		}

		return false;
	}

	public boolean solution(int[] arrA, int[] arrB) {
		// 1. arrA와 arrB의 길이를 비교한다.
		if (arrA.length != arrB.length)
			return false;
		// 2. arrA와 arrB의 구성 요소를 비교한 후, arrA를 n번 회전 했을 시 동일한지 가능성 확인한다.
		if (fun_a(arrA, arrB)) {
			int[] arrTmp = fun_b(arrA);
			// 3. 2배 커진 arrA의 부분 배열이 arrB에 일부 존재하는지 확인한다.
			if (fun_c(arrTmp, arrB))
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		question_01_01 sol = new question_01_01();
		int[] arrA = { 1, 2, 3, 4 }, arrB = { 3, 4, 1, 2 };
		boolean result = sol.solution(arrA, arrB);
		System.out.println(result);
	}
}
