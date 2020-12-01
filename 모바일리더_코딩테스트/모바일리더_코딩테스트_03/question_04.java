package 모바일리더_코딩테스트_03;

public class question_04 {
	public int solution(String s1, String s2) {
		// s1 문자열을 뒤집어 배열로 저장한다.
		char[] arr1 = new char[s1.length()];
		char[] arr2 = s2.toCharArray();
		int t = 0;
		for (int i = s1.length() - 1; i > -1; i--) {
			arr1[t] = s1.charAt(i);
			t++;
		}

		// 뒤집힌 s1의 0 번째 인덱스와 s2의 i 번째 인덱스가 같아야
		// s1의 1... 번째와 s2의 i + 1 번째 인덱스를 비교할 수 있다.
		int count = 0;
		for (int idx = 0; idx < arr2.length; idx++) {
			// s2 idx 번째 인덱스 중 뒤집힌 s1의 0 번째 인덱스와 같은 데이터를 찾는다.
			if (arr1[0] == arr2[idx]) {
				System.out.println("arr1[" + 0 + "] = " + arr1[0] + " / arr2[" + idx + "] = " + arr2[idx]);
				int k = 1;
				// 위의 조건에 부합하다면
				for (int i = idx - 1; i > -1; i--, k++) {
					// s2의 인덱스를 다시 역순으로 탐색한다.
					// s1의 인덱스를 순서대로 탐색한다.
					if (k < arr1.length) {
						count++;
						System.out.println("arr1[" + k + "] = " + arr1[k] + " / arr2[" + i + "] = " + arr2[i]);
						if (arr1[k] != arr2[i]) {
							break;
						}
					}
				}
				break;
			}
		}
		count += 1;

		StringBuffer sb = new StringBuffer();
		sb.append(s1);
		sb.append(s2.substring(count));
		System.out.println("합성 가능 인덱스 개수 = " + count);
		System.out.println("문자열 합성 결과 = " + sb.toString());
		int answer = sb.toString().length();
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		question_04 sol = new question_04();
		String s1 = new String("ababcz");
		String s2 = new String("zabcdab");
		int ret = sol.solution(s1, s2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
