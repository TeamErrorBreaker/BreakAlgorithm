package 심성헌.quiz;

public class quiz01 {
    
    static int max4(int a, int b, int c, int d) {

        int max = a; // 초기의 최댓값은 a 이다.

        if(b > max) max = b; // b 가 max 보다 클 경우 max 는 b 이다.

        if(c > max) max = c; // c 가 max 보다 클 경우 max 는 c 이다.

        if(d > max) max = d; // d 가 max 보다 클 경우 max 는 d 이다.

        return max;
    }

    static int min3(int a, int b, int c) {
        
        int min = a; // a 는 현재 최소값이다.

        if(b < min) min = b; // b 가 min 보다 작을 경우 min 은 b 이다.

        if(c < min) min = c; // c 가 min 보다 작을 경우 min 은 c 이다.

        return min;
    }

    static int min4(int a, int b, int c, int d) {

        int min = a; // 초기의 최소값은 a 이다.

        if(b < min) min = b; // b 가 min 보다 작을 경우 min 은 b 이다.

        if(c < min) min = c; // c 가 min 보다 작을 경우 min 은 c 이다.

        if(d < min) min = d; // d 가 min 보다 작을 경우 min 은 d 이다.

        return min;
    }

    public static void main(String[] args) {
        int max4 = max4(3, 1, 4, 2);

        int min3 = min3(1, 4, 0);

        int min4 = min4(1, 0, 3, -1);

        System.out.println("max4() : " + max4);
        System.out.println("min3() : " + min3);
        System.out.println("min4() : " + min4);
    }
}
