/*
    영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
    문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을
    return하도록 solution 함수를 완성해주세요.
 */
package programmers.basic;

public class VowelDelete {
    public String solution(String my_string) {
        // 결과 문자열을 저장하기 위한 StringBuilder 객체 생성
        StringBuilder answer = new StringBuilder();
        // 주어진 문자열의 각 문자를 하나씩 순회
        for (int i = 0; i < my_string.length(); i++) {
            // 현재 문자
            char c = my_string.charAt(i);
            // 모음(a, e, i, o, u)이 아닌 경우에만 결과 문자열에 추가
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                answer.append(c);
            }
        }
        // StringBuilder 객체를 문자열로 변환하여 반환
        return answer.toString();
    }

    public static void main(String[] args) {
        VowelDelete vowelDelete = new VowelDelete();
        System.out.println(vowelDelete.solution("Hello world !")); // Hll wrld !
    }
}
