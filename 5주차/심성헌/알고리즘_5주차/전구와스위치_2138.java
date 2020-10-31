package 심성헌.알고리즘_5주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 전구와스위치_2138 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, count, answer;
	static int[][] arr;
	static int[] check;

	public static void main(String[] args) throws Exception {
		n = Integer.parseInt(br.readLine());
		arr = new int[2][n];
		check = new int[n];
		answer = Integer.MAX_VALUE;

		String input = br.readLine();
		String input2 = br.readLine();
		for (int i = 0; i < input.length(); i++) {
			arr[0][i] = input.charAt(i) - '0';
			arr[1][i] = input.charAt(i) - '0';
			check[i] = input2.charAt(i) - '0';
		}
		// arr[0] : 0 번째 전구를 켜지 않는 경우
		play(1, 0, 0);
		// arr[1] : 0 번째 전구를 킨다.
			// arr[1][0], arr[1][1] 전구가 켜진다.
		onoff(0, 1);
		// arr[1] : 0 번째 전구를 킨 상태에서 탐색한다.
		play(1, 1, 1);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[1][i]);
		}
		System.out.println("\n");
		// arr[0] 와 arr[1] 중 최소한의 count를 출력한다.
			// 만약 주어진 조건으로 전구를 바꾸지 못할 경우 -1을 출력한다.
		System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
	}

	// 전구의 전원을 스위치하는 기능
	public static void onoff(int idx, int type) {
		for (int i = idx - 1; i <= idx + 1; i++) {
			if (i >= 0 && i < n)
				arr[type][i] = arr[type][i] == 1 ? 0 : 1;
		}
	}

	// 주어진 전구를 탐색한다.
	// 현재 인덱스의 -1에 해당하는 인덱스가 check와 다른 경우
		// 스위치를 킨다.
		// 다음 play 기능으로 돌아간다.
	// 현재 인덱스의 -1에 해당하는 인덱스가 check와 같은 경우
		// 스위치를 켤 필요가 없으니
		// 스위치를 켜지 않는다.
		// count를 세지 않는다.
	// 현재 인덱스가 n과 같은 경우 인덱스 범위를 넘었기 때문에 리턴
		// 만약 n-1의 arr와 check의 인덱스 값이 같은 경우
			// answer는 count보다 작을 경우 count 값이 되고,
			// 아닐 경우에는 answer 값그대로.
	public static void play(int idx, int type, int count) {
		if (idx == n) {
			if (arr[type][idx - 1] == check[idx - 1])
				answer = answer > count ? count : answer;
			return;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[type][i]);
		}
		System.out.println();
		System.out.println("---------------");
		if (arr[type][idx - 1] != check[idx - 1]) {
			onoff(idx, type);
			play(idx + 1, type, count + 1);
		} else
			play(idx + 1, type, count);
	}
}
