package programmers.basic;

public class HiddenNumberPlus {
    public static void main(String[] args) {
        System.out.println(solution("sdvcsdv5vsdv2s555vs23d5dvsa6"));
    }
    public static int solution(String my_string) {
        int sum = 0;
        int num = 0;
        boolean isPrevDigit = false;

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                isPrevDigit = true;
            } else {
                if (isPrevDigit) {
                    sum += num;
                    num = 0;
                    isPrevDigit = false;
                }
            }
        }

        if (isPrevDigit) {
            sum += num;
        }
        return sum;
    }
}
