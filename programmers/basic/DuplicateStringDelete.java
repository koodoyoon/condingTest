/*
    문자열 my_string이 매개변수로 주어집니다.
    my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을
    return하도록 solution 함수를 완성해주세요.
 */

package programmers.basic;

public class DuplicateStringDelete {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (answer.indexOf(Character.toString(currentChar)) == -1) {
                answer.append(currentChar);
            }
        }
        return answer.toString();

    }
    public static void main(String[] args) {
        DuplicateStringDelete duplicateStringDelete = new DuplicateStringDelete();
        System.out.println(duplicateStringDelete.solution("Hello World !")); // Helo Wrd!
    }
}
