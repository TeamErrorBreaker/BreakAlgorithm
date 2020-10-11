package 심성헌.사이버다임_코딩테스트;

public class 다중반복문에러결과 {

	public static void main(String[] args) {

		int total = 0;

		for (int i = 0; i < 5; i++) {
			
			for (int k = 0; k < i; i++) {
				total++;
				System.out.println(total);
			}
			
		}
		
	}

}
