package programmers.basic;

public class ContinuousNumberSum {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int standard = total / num;
        int rest = num / 2;
        int odd = standard - rest;
        int even = standard - (num / 2) + 1;

        for (int i = 0; i < num; i++) {
            if (num % 2 == 0) {
                answer[i] += even;
                even++;
            } else if (num % 2 == 1) {
                answer[i] += odd;
                odd++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 55));
    }
}
