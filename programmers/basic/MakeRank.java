package programmers.basic;

public class MakeRank {
    public static int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (score[i][0] + score[i][1]) / 2;
        }
        
        int[] sortedAnswer = answer.clone();
        java.util.Arrays.sort(sortedAnswer);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (answer[i] == sortedAnswer[j]) {
                    result[i] = n - j;
                    sortedAnswer[j] = -1;
                    break;
                }
            }
        }

        for (int r : result) {
            System.out.println(r);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}}));
    }
}
