package 심성헌;

public class 두정수사이의합_프로그래머스 {
    public static void main(String[] args) {
        int a = 3, b = 5;
        long result1 = solution1(a, b);
        long result2 = solution2(a, b);
        System.out.println(result1 + " / " + result2);
    }

    // 조건문 + 반복문의 전형적인 코드
    public static long solution1(int a, int b) {
        long answer = 0;
        for (int i = a < b ? a : b; i <= (a > b ? a : b); i++) {
            answer += i;
        }
        return answer;
    }

    // 등차수열을 이용한 풀이
    public static long solution2(int a, int b) {
        return sum(Math.min(a, b), Math.max(b, a));
    }

    public static long sum(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
