package programmers.basic;

import java.util.ArrayList;

public class CutStringInsertArray {
    public static void main(String[] args) {
        System.out.println(solution("asfsvksavksdav", 3));
    }
    public static String[] solution(String my_str, int n) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i += n) {
            if (i + n <= my_str.length()) {
                result.add(my_str.substring(i, i + n));
            } else {
                result.add(my_str.substring(i));
            }
        }

        return result.toArray(new String[0]);
    }
}
