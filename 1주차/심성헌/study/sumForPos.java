package 심성헌.study;

import java.util.Scanner;

public class sumForPos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        // dowhile 문은 while 문의 조건 안에 부합할 때까지 반복한다.
        do{
            System.out.println("n : ");
            n = sc.nextInt();
        } while(n <= 0);

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

        sc.close();
    }
}
