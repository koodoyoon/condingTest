package programmers.basic;

public class NumberThree {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
