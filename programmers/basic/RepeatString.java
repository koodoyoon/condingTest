package programmers.basic;

public class RepeatString {
    public String solution(String my_string, int n) {
        // 결과 문자열을 구성하기 위해 StringBuilder를 사용합니다.
        StringBuilder sb = new StringBuilder();

        // 문자열의 각 문자를 반복하여 StringBuilder에 추가합니다.
        for (int i = 0; i < my_string.length(); i++) {
            // 문자열의 i번째 문자를 가져옵니다.
            char c = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                // 문자를 n번 반복하여 StringBuilder에 추가합니다.
                sb.append(c);
            }
        }
        // StringBuilder에 추가된 문자열을 String 형태로 반환합니다.
        return sb.toString();
    }
    public static void main(String[] args) {
        RepeatString repeatString = new RepeatString();
        System.out.println(repeatString.solution("hello",3)); // hhheeellllllooo
    }
}
