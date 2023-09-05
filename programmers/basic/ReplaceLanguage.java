package programmers.basic;

import java.util.Arrays;

public class ReplaceLanguage {
    public static String solution(String my_string, String overwrite_string, int s) {
        char[] chars = my_string.toCharArray();
        char[] chars1 = overwrite_string.toCharArray();
        for (int i = 0; i < overwrite_string.length(); i++) {
            chars[s] = chars1[i];
            s++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(chars);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Program29b8UYP";
        String b = "merS123";
        System.out.println(solution(s, b ,7));
    }
}