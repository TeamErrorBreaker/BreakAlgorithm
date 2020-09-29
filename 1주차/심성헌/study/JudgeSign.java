package 심성헌.study;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요.");
        int n = sc.nextInt();

        if(n > 0) {
            System.out.println(n + "은 정수입니다.");
        } else if(n < 0) {
            System.out.println(n + "은 음수입니다."); 
        } else {
            System.out.println(n + "은 0 입니다.");
        }
        sc.close();

        /*
            위의 경우에서는 3가지의 경우 중 하나가 무조건 실행되는 경우이다.
            하지만 else 가 없다면 분기되는 모양이 위와는 달라지면서 전혀 다른 결과가 나올 수 있다. 
        */
    }
}
