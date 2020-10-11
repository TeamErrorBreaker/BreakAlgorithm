package 심성헌.사이버다임_코딩테스트;

public class 단순선택정렬 {

	static public void select(int[] n) {

		int min;
		int save;

		for (int i = 0; i < n.length; i++) {
			min = n[i];
			for (int k = i + 1; k < n.length; k++) {
				boolean checkMin = min > n[k];
				if (checkMin) {
					min = n[k];

					save = n[i];
					n[i] = n[k];
					n[k] = save;
				}
			}

			System.out.println(n[i]);

		}

	}

	public static void main(String[] args) {
		int[] n = { 1, 10, 2, 3, 8, 7 };

		select(n);
	}

}
