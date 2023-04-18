package programmers.basic;

public class UpperCaseToLowerCase {
    public String solution(String my_string) {
        // 문자 하나하나를 담을 StringBuilder 객체 생성
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            // 읽어온 문자
            char c = my_string.charAt(i);
            // 대문자인 경우
            if (c >= 'A' && c <= 'Z') {
                // 소문자로 변경 (아스키코드 차이는 32)
                c = (char)(c + ('a' - 'A'));
            }
            // 소문자인 경우
            else if (c >= 'a' && c <= 'z') {
                // 대문자로 변경 (아스키코드 차이는 32)
                c = (char)(c - ('a' - 'A'));
            }
            // 변경된 문자를 StringBuilder 객체에 담기
            answer.append(c);
        }
        // StringBuilder 객체를 문자열로 변환하여 반환
        return answer.toString();
    }
    public static void main(String[] args) {
        UpperCaseToLowerCase upperCaseToLowerCase = new UpperCaseToLowerCase();
        String string = "abcdDJNVdedCNDJ";
        System.out.println(upperCaseToLowerCase.solution(string));
        // ABCDdjnvDEDcndj
    }
}
