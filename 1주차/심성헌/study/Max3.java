package 심성헌.study;

import java.util.Scanner;

public class Max3 {

    public static void main(String[] args) {
        // Scanner 클래스 선언
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구하시오.");

        System.out.println("a : "); int a = sc.nextInt();
        System.out.println("b : "); int b = sc.nextInt();
        System.out.println("c : "); int c = sc.nextInt();

        int max = a; // 최댓값은 현재 a 이다.
        if(b > max) max = b; // b 가 max 보다 클 경우 max 는 b 다.
        if(c > max) max = c; // c 가 max 보다 클 경우 max 는 c 다.

        System.out.println("최댓값 max는 " + max + " 입니다.");

        // Scanner 사용 후 종료
        sc.close();
    }
}
