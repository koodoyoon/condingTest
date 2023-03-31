/*
    문자열 my_string과 문자 letter이 매개변수로 주어집니다.
     my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
package programmers.basic;

public class RemoveChar {
    public String solution(String my_string, String letter) {
        // StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();
        // 문자열 my_string의 각 문자를 조회
        for (char c : my_string.toCharArray()) {
            // 문자열 letter에 해당하는 문자가 아닌 경우
            if (!letter.contains(Character.toString(c))) {
                // StringBuilder에 문자 추가
                sb.append(c);
            }ㅇ
        }
        // StringBuilder 객체를 문자열로 변환하여 반환
        return sb.toString();
    }
}
