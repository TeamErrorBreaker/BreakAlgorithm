package 심성헌.quiz;

public class quiz06 {
    
    // 왼쪽 아래가 직각인 이등변 삼각형 만들기
    public static void triangleLB(int n) {

        for(int i = 1; i <= n; i++) {

            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 왼쪽 위가 직각인 이등변 삼각형 만들기
    public static void triangleLU(int n) {

        for(int i = n; i > 0; i--) {
            // System.out.println(i);
            for(int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 위가 직각인 이등변 삼각형 만들기
    public static void triangleRU(int n) {

        for(int i = n; i > 0; i--) {
            int m = n - i;
            if(m > 0) {
                for(int t = 0; t < m; t++) {
                    System.out.print(" ");
                }
            }
            for(int k = i; k > 0; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // 오른쪽 아래가 직각인 이등변 삼각형 만들기
    public static void triangleRB(int n) {

        for(int i = 1; i <= n; i++) {
            int m = n - i;
            if(m > 0) {
                for(int t = 0; t < m; t++) {
                    System.out.print(" ");
                }
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // 별문자로 피라미드 만들기
    public static void spira(int n) {
        int h = n / 2;

        for(int i = 0; i < n; i++) {
            for(int p = 0; p <= h - i; p++) {
                System.out.print(" ");
            }
            for(int k = h - i; k >= 0 && k <= h + i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 숫자로 피라미드 만들기
    public static void npira(int n) {
        int h = n / 2;

        for(int i = 0; i < n; i++) {
            for(int p = 0; p <= h - i; p++) {
                System.out.print(" ");
            }

            for(int k = h - i; k >= 0 && k<= h + i; k++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // 왼쪽 아래가 직각인 이등변 삼각형 만들기
        triangleLB(11);
        
        System.out.println();

        // 왼쪽 위가 직각인 이등변 삼각형 만들기
        triangleLU(11);

        System.out.println();

        // 오른쪽 위가 직각인 이등변 삼각형 만들기
        triangleRU(11);

        System.out.println();

        // 오른쪽 아래가 직각인 이등변 삼각형 만들기
        triangleRB(11);

        System.out.println();

        // 별문자로 피라미드 만들기
        spira(11);

        System.out.println();

        // 숫자로 피라미드 만들기
        npira(11);
    }
}
