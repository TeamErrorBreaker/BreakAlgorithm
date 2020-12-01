package 모바일리더_코딩테스트_02;

public class question_09 {
	public String func_a(String str, int len){
	        String padZero = "";
	        int padSize = str.length();
	        for(int i = 0; i < padSize; i++)
	            padZero += "0";
	        return padZero + str;
	    }

	public int solution(String binaryA, String binaryB) {
	        int maxLength = Math.max(binaryA.length(), binaryB.length());
	        binaryA = func_a(binaryA, maxLength);
	        binaryB = func_a(binaryB, maxLength);
	        
	        int hammingDistance = 0;
	        for(int i = 0; i < maxLength; i++)
	            if(binaryA.charAt(i) != binaryB.charAt(i))
	                hammingDistance += 1;
	        return hammingDistance;
	    }

	// The following is main method to output testcase.
	public static void main(String[] args) {
		question_09 sol = new question_09();
		String binaryA = "10010";
		String binaryB = "110";
		int ret = sol.solution(binaryA, binaryB);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret + " .");
	}
}
