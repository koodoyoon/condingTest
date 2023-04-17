/*
    문자열 my_string이 매개변수로 주어집니다.
    my_string안의 모든 자연수들의 합을
    return하도록 solution 함수를 완성해주세요.
 */
package programmers.basic;

public class NumberSubToString {
    public static int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            // 현재 문자가 숫자인지 확인
            if (Character.isDigit(ch)) {
                // 숫자라면, 해당 숫자 값을 sum에 더함
                answer += Character.getNumericValue(ch);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp")); // 10
        System.out.println(solution("1a2b3c4d123")); // 16
    }
}
