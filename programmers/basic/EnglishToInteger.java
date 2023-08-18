package programmers.basic;

import java.util.HashMap;
import java.util.Map;

public class EnglishToInteger {
    public static void main(String[] args) {
        System.out.println(solution("onezerotwothreenineeight"));
    }
    public static long solution(String numbers) {
        Map<String, Integer> map = new HashMap<>();

        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        StringBuilder result = new StringBuilder();

        while (numbers.length() > 0) {
            boolean flag = false;
            for (String key : map.keySet()) {
                if (numbers.startsWith(key)) {
                    result.append(map.get(key));
                    numbers = numbers.substring(key.length());
                    flag = true;
                    break;
                }
            }
            if (!flag) break;
        }

        return Long.parseLong(result.toString());
    }
}
