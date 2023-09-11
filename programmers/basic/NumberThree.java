package programmers.basic;

public class NumberThree {
    public static int solution(int n) {
        int answer = 1;

        for (int i = 1; i <= n; i++) {

            if (answer > 2) {
                if (answer % 3 == 0) {
                    answer++;
                }
                if (answer % 10 == 3) {
                    answer++;
                }
                if (answer > 9) {
                    if (answer % 30 < 10) {
                        answer++;
                    }
                }
            }
            answer++;

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
