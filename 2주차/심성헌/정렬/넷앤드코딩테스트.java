package 심성헌.정렬;

public class 넷앤드코딩테스트 {

	static public int toint(String strValue) {

		if (strValue == null || strValue.length() == 0) {
			throw new IllegalArgumentException();
		}

		int intValue = 0;
		try {
			intValue = Integer.parseInt(strValue);
		} catch (Exception e) {
			intValue = 0;
		}

		return intValue;
	}

	public static void main(String[] args) {
		String strValue = "100";
		System.out.println(toint(strValue));
		strValue = "10";
		System.out.println(toint(strValue));
		strValue = "hello";
		System.out.println(toint(strValue));
	}
}
