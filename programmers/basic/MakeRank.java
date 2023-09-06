package programmers.basic;

import java.util.Arrays;

public class MakeRank {
    public static int[] solution(int[][] score) {
        int length = score.length;
        int[] answer = new int[length];
        double[] avg = new double[length];

        for (int i = 0; i < length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (avg[i] < avg[j]) {
                    answer[i]++;
                }
            }
            answer[i]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}}));
    }
}
