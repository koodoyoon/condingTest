package programmers.basic;

public class CalcString {
    public static void main(String[] args) {
        System.out.println(solution("13 + 15 - 11 + 37 - 12 + 6"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        StringBuilder tempNumber = new StringBuilder();
        char prevOp = '+';

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch == '+' || ch == '-') {
                if (tempNumber.length() > 0) {
                    int number = Integer.parseInt(tempNumber.toString());

                    if (prevOp == '+') {
                        answer += number;
                    } else {
                        answer -= number;
                    }

                    tempNumber.setLength(0);  // StringBuilder 내용 초기화
                }
                prevOp = ch;
            } else if (Character.isDigit(ch)) {
                tempNumber.append(ch);
            }
        }

        // 마지막 숫자 처리
        if (tempNumber.length() > 0) {
            int number = Integer.parseInt(tempNumber.toString());
            if (prevOp == '+') {
                answer += number;
            } else {
                answer -= number;
            }
        }

        return answer;
    }
}
