package 심성헌.알고리즘_1주차;

public class 별찍기 {

	public static void star(int n) {

		for (int i = 1; i <= n; i++) {
			// 공백 찍기
			for (int k = i - 1; k < n - 1; k++) {
				System.out.print(" ");
			}
			// 별 찍기
			for (int t = 0; t < i; t++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		star(5);
	}
}
