package 심성헌.study;

import java.util.Scanner;

public class TriangleLB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값에 맞는 삼각형 모양을 만들자!
        System.out.print("n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            
            for(int k = 0; k < i; k++) {
            
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
