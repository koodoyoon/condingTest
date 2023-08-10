package programmers.basic;

import java.util.*;

public class OnceAppear {
    public static void main(String[] args) {
        System.out.println(solution("vvmdlscck"));
    }
    public static String solution(String s) {
        int[] charFrequency = new int[26];

        for (char c : s.toCharArray()) {
            charFrequency[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (charFrequency[i] == 1) {
                result.append((char) (i + 'a'));
            }
        }

        return result.toString();
    }
}
