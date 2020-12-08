package 심성헌.알고리즘_6주차;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 두개뽑아서더하기_프로그래머스 {

	public static void main(String[] args) {
		int[] arr = { 5, 0, 2, 7 };
		int[] answer = solution(arr);

		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}

	public static int[] solution(int[] numbers) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < numbers.length - 1; i++) {
			int x = numbers[i];
			for (int k = i + 1; k < numbers.length; k++) {
				int y = numbers[k];
				set.add(x + y);
			}
		}

		Iterator<Integer> iter = set.iterator();

		int[] answer = new int[set.size()];
		int cnt = 0;
		while (iter.hasNext()) {
			answer[cnt] = iter.next();
			cnt++;
		}

		for (int i = 0; i < answer.length - 1; i++) {
			int tmp = answer[i];
			for(int k = i + 1; k < answer.length; k++) {
				if(tmp > answer[k]) {
					answer[i] = answer[k];
					answer[k] = tmp;
					tmp = answer[i];
				}
			}
		}

		return answer;
	}
}
