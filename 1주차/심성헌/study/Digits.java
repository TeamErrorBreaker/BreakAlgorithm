package 심성헌.study;

import java.util.Scanner;

public class Digits {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("2 자리 정수를 입력하세요.");

        do {
            System.out.print("n : ");
            n = sc.nextInt();
        } while(n < 10 || n > 99); // n 이 10 과 99 사이의 정수일 때 해당 반복문이 멈춘다.

        System.out.println("n 의 값은 " + n + "입니다.");

        sc.close();
    }
}
