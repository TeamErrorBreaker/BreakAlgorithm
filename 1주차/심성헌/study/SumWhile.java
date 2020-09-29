package 심성헌.study;

import java.util.Scanner;

public class SumWhile {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 부터 n 까지의 합을 구합니다.");
        System.out.println("n : "); int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while(i <= n){
            sum += i;
            i++;
        }

        System.out.println("1 부터 n 까지의 합은 " + sum + " 입니다.");

        sc.close();
    }
}
