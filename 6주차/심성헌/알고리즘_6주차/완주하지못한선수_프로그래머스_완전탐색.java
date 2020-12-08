package 심성헌.알고리즘_6주차;

public class 완주하지못한선수_프로그래머스_완전탐색 {
	public static void main(String[] args) {
		String[] arr = { "mislav", "stanko", "mislav", "ana" };
		String[] comp = { "stanko", "ana", "mislav" };

		String result = solution(arr, comp);
		System.out.println(result);

	}

	public static String solution(String[] participant, String[] completion) {

		boolean[] check = new boolean[completion.length];
		boolean tmp;
		String answer = "";
		for (int i = 0; i < participant.length; i++) {
			tmp = false;
			for (int k = 0; k < completion.length; k++) {
				if (participant[i].equals(completion[k]) && !check[k]) {
					check[k] = true;
					tmp = true;
					break;
				}
			}
			if(!tmp) {
				answer = participant[i];
				break;
			}
		}

		return answer;
	}
}
