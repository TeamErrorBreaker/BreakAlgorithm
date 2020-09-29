package 심성헌.study;

public class Max3m {
    
    static int max3(int a, int b, int c) {
        
        int max = a;
        
        if (b > max) max = b;

        if(c > max) max = c;
        
        return max;
    }

    public static void main(String[] args) {
        
        int result = max3(10, 100, 1000);

        System.out.println("max3() 의 return 값은 " + result + " 입니다.");
    }
}
