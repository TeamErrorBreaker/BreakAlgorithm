package 심성헌.quiz;

import java.util.Scanner;

public class quiz02 {
    
    // 13가지의 경우의 수를 일일히 조건문을 걸었을 때
    static int med3(int a, int b, int c) {
        if(a >= b) {
            // a 가 b 보다 크거나 같을 경우
            if(b >= c) {
                // b 가 c 보다 크거나 같을 경우
                // 즉, a >= b >= c
                return b; 
            } else if(a <= c) {
                // a 가 c 보다 작거나 같은 경우
                // 즉, c >= a >= b
                return a;
            } else {
                // a >= c >= b
                return c;
            }
        } else if(b < c) {
            // c > b > a
            return b;
            // b > c > a
        } else if(a < c) {
            return c;
        } else {
            // b > a > c
            return a;
        }
    }

    // 비교조건문을 이용해서 중앙값을 구하는 방법
    // 위의 모든 경우의 수보다 성능이 떨어진다. 그 이유는?
    static int MED3(int a, int b, int c){
        if((a >= b && b >= c) || (a <= b && c >= b)) {
            // a >= b >= c || c >= b >= a
            return b;
        } else if((a <= b && a >= c) || (a <= c && a >= b)) {
            // b >= a >= c || c >= a >= b
            return a;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a : "); int a = sc.nextInt();
        System.out.println("b : "); int b = sc.nextInt();
        System.out.println("c : "); int c = sc.nextInt();

        sc.close();

        // 모든 경우의 수를 만들었을 때
        System.out.println("세 정수의 가운데 값은 " + med3(a, b, c) + " 입니다.");

        // 비교조건문을 이용해서 코드의 길이를 줄였을 때
        System.out.println("세 정수의 가운데 값은 " + MED3(a, b, c) + " 입니당.");

        /*
        경우의 수를 나열한 메소드와 비교조건문을 이용한 메소드의 성능이 다르다.
        왜냐하면 컴퓨터가 해당 조건들을 연산할 때, 비교조건문은 모든 경우의 수를 연산 후 결과값을 반환하고,
        경우의 수를 나열한 함수는 그 때에 맞는 조건만 지나가기 때문에 훨씬 빠른 속도를 낸다.

        즉, 빠른 속도를 잡을 것이냐, 짧은 코드를 잡을 것이냐의 차이이다.
        */
    }
}
