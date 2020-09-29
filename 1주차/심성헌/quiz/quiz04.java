package 심성헌.quiz;

import java.util.Scanner;

public class quiz04 {
    
    
    // a 보다 더 큰 수인 b 와 a 를 뺀 값을 반환하세요.
    public static int sumForPos(){
        Scanner sc = new Scanner(System.in);

    
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
    
        do{
            System.out.println("a 보다 더 큰 정수를 입력해주세요.");
            System.out.print("b : ");
            b = sc.nextInt();
        } while(b < a);
    
        int result = b - a;
    
        System.out.println("결과값 : " + result);
    
        sc.close();
        return result;
    }

    public static int quiz(){
        Scanner sc = new Scanner(System.in);

        System.out.print("n : ");
        int n = sc.nextInt();
        int count = 0;
        sc.close();

        if(n < 10) {
            // 입력값이 10 보다 작으면 1의 자리수
            return 1;
        } else {
            // 입력값이 10보다 클 경우 10의 자리수 이상이라는 뜻
            for(int i = 1; n >= i; i *= 10) {

                boolean bool = n / i > 0;

                if(bool) {
                    count++;
                }
            }
            return count;
        }


    }

    public static void main(String[] args) {

        // int result = sumForPos();
        // System.out.println("퀴즈 1번 정답 : " + result);

        System.out.println("n 은 " +quiz() + "자리입니다.");
    }
}
