package 심성헌.study;

import java.util.Scanner;

public class SumFor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 부터 n 까지의 합을 구하세요.");
        System.out.println("n :"); int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("총 합은 " + sum + " 입니다.");
        sc.close();
    }
}
