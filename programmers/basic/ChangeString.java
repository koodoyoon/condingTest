/*
    문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
    my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을
    return 하도록 solution 함수를 완성해보세요.
 */

package programmers.basic;

public class ChangeString {
    public String solution(String my_string, int num1, int num2) {
//        처음에 짠 코드
//        char[] string = new char[my_string.length()];
//        char temp;
//        for (int i = 0; i < my_string.length(); i++) {
//            string[i] = my_string.charAt(i);
//        }
//        temp = string[num1];
//        string[num1] = string[num2];
//        string[num2] = temp;
//        return string;
        // 고친 코드
        String answer = "";
        char[] c = my_string.toCharArray();
//        char temp = c[num1];
//        c[num1] = c[num2];
//        c[num2] = temp;
        c[num1] = my_string.charAt(num2);
        c[num2] = my_string.charAt(num1);
        answer = String.valueOf(c);
        return answer;
    }
    public static void main(String[] args) {
        ChangeString changeString = new ChangeString();
        System.out.println(changeString.solution("hello",1,2));
    }
}
