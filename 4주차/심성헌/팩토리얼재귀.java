package 심성헌;

public class 팩토리얼재귀 {

	public static void main(String[] args) {

		System.out.println(answer(6));

	}

	public static int answer(int n) {

		if (n > 1) {
			int z = answer(n - 1);
			n = n * z;
		}

		return n;

	}

}
