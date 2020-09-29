package 심성헌.study;

public class Multi99Table {
    
    public static void main(String[] args) {
        System.out.println("-----------곱셈표------------");

        for(int i = 1; i <= 9; i++) {
            
            for(int k = 1; k <= 9; k++) {
                int n = i * k;
                System.out.printf("%3d", n);
            }
            System.out.println();
        }
    }
}
