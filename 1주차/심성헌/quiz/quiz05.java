package 심성헌.quiz;

public class quiz05 {
    
    // 표 모양대로 구구단을 그려라!
    public static void sum() {
        
        for(int i = 1; i <= 9; i++) {

            int n = 0;

            for(int k = 1; k <= 9; k++) {

                n = i * k;
                
                System.out.printf("%3d", n);

                if(n == i) {
                    // 부모 숫자와 결과값이 같다면 구분선을 그려라
                    System.out.print(" |");
                }
            }
            System.out.println();
            if(n == 9) {
                // 해당 구구단 순번에서 마지막 숫자가 9라면 구분선을 그려라
                System.out.println("---+-------------------------");
            }
        }
    }
    
    // 표 모양대로 덧셈표를 그려라!
    public static void add() {
        
        for(int i = 0; i <= 9; i++) {
            
            int n = 0;

            for(int k = 0; k <= 9; k++) {

                n = i + k;
                System.out.printf("%3d", n);

                if(n == i) {
                    System.out.print(" |");
                }

            }
            System.out.println();
            if(n == 9) {
                System.out.println("----+----------------------------");
            }
        }
    }

    // 파라미터 값에 맞게 별문자로 사각형을 만들자!
    public static void starBox(int n) {

        for(int i = 0; i < n; i++) {
            for(int k = 0;k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 모양에 맞게 구구단 표 만들기
        System.out.println("------------구구단-----------");
        sum();

        System.out.println("\n");
        System.out.println("--------------덧셈표-------------");
        // 모양에 맞게 덧셈표 만들기
        add();

        System.out.println("\n");
        // 파라미터 값에 맞게 별로 사각형 만들기!
        starBox(10);
    }
}
