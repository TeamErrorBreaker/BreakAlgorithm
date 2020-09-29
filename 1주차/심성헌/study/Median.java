package 심성헌.study;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {

        if(a >= b) { // a 가 b 보다 크거나 같을 경우
            if(b >= c) {
                // b 가 c 보다 크거나 같을 경우
                // 즉, a >= b >= c
                return b;
            } else if(a <= c) {
                // a 가 c 보다 작거나 같을 경우
                // 즉, b >= a >= c
                return a;
            } else {
                // 위의 경우가 모두 아닐 경우
                // 즉, a >= c >= b
                return c;
            }
        } else if(a > c) {
            // 첫 번째 전제가 거짓일 경우
            // a 가 c 보다 클 경우
            // 즉, b > a > c
            return a;
        } else if(b > c) {
            // b 가 c 보다 클 경우
            // 즉, b > c > a
            return c;
        } else {
            // 모든 전제가 거짓일 경우
            // 즉, c > b > a
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a : "); int a = sc.nextInt();
        System.out.println("b : "); int b = sc.nextInt();
        System.out.println("c : "); int c = sc.nextInt();

        sc.close();
        int med = med3(a, b, c);
        System.out.println("세 정수의 중앙값 : " + med);
    }
}
