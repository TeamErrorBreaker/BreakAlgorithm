package 심성헌;

import com.sun.jdi.IntegerType;

import java.util.*;
import java.util.stream.Collectors;

public class 문자열내마음대로정렬하기_프로그래머스 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] result = solution(strings, n);
        for (String str : result) {
            System.out.print(str + " ");
        }
    }

    // HashMap stream으로 Key 값 정렬하기
    // n 번째 idx가 같을 경우 그 다음 문자열을 정렬해야 하는데 머리가 안돌아간다.
    // 주말에 고민을 조금 더 해봐야겠다.
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(i, strings[i].substring(n, n + 1));
        }
        List<Map.Entry> list = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        int i = 0;
        for (Map.Entry entry : list) {
            int idx = (int) entry.getKey();
            answer[i] = strings[idx];
            i++;
        }
        return answer;
    }
}
