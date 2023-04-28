/*
    영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
    my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을
    return 하도록 solution 함수를 완성해보세요.
 */

package programmers.basic;

import java.util.*;

public class ChangeLowerCase {
    public String solution(String my_string) {
//        // 처음 작성한 코드
//        StringBuilder answer = new StringBuilder();
//        for (int i = 0; i < my_string.length(); i++) {
//            char c = my_string.charAt(i);
//            if (c >= 'A' && c <= 'Z') {
//                c = (char)(c + ('a' - 'A'));
//            }
//            answer.append(c);
//        }
//        char[] chars = answer.toString().toCharArray();
//        Arrays.sort(chars);
//        String sortedString = new String(chars);
//        return sortedString;
        // 간단한 수정된 코드
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static void main(String[] args) {
        ChangeLowerCase changeLowerCase = new ChangeLowerCase();
        System.out.println(changeLowerCase.solution("FeCDeGdGGGvBaA")); // aabcddeefggggv
    }
}
