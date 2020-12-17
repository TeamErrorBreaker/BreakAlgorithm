package 심성헌;

import java.util.*;

public class 나누어떨어지는숫자배열_프로그래머스 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int[] result1 = solution1(arr, divisor);
        int[] result2 = solution2(arr, divisor);
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
            System.out.println(result2[i]);
        }
    }

    // 배열의 인덱스의 나머지를 하나씩 구하는 방법
    public static int[] solution1(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int data : arr) {
            if (data % divisor == 0) {
                list.add(data);
            }
        }

        int[] answer;
        if (list.size() != 0) {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }

    // 람다식으로 구현한 방법 -> 속도가 느리다.
    public static int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(data -> data % divisor == 0).toArray();
        if (answer.length == 0) answer = new int[]{-1};
        Arrays.sort(answer);
        return answer;
    }
}
