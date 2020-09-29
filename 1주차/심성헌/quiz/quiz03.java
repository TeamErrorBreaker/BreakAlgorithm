package 심성헌.quiz;

public class quiz03 {
    
    // for 문을 이용해서 n ~ m 까지의 합을 구하라.
    public static int sumFor(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    // 가우스의 덧셈을 이용해서 n ~ m 까지의 합을 구하라
    // 가우스의 덧셈 ?
    // (n + m) * (m / 2)
    public static int gauss(int n){
        int start = 1;
        double m = n / 2.0;
        int result = (int) ((start + n) * m);

        return result;
    }

    // 정수 a, b 를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하라
    // 가우스의 덧셈은 무조건 1 부터 시작해야 성립이 되는걸까?
    public static int sumOf(int a, int b) {

        int sum = 0;

        for(int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("for문을 이용한 1 ~ n 까지의 합 : " + sumFor(100));

        System.out.println("가우스의 덧셈을 이용한 1 ~ n 까지의 합 : " + gauss(100));

        System.out.println("a ~ b 까지의 합 : " + sumOf(3, 5));
    }
}
