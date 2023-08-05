package programmers.basic;

import java.util.Arrays;

public class BeforeAfter {
    public static void main(String[] args) {
        System.out.println(solution("hello", "elloh"));
    }

    public static int solution(String before, String after) {
        char[] char1 = before.toCharArray();
        char[] char2 = after.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if (before.length() == after.length()) {
            if (!Arrays.equals(char1, char2)) {
                return 0;
            }
            return 1;
        } else {
            return 0;
        }
    }
}
