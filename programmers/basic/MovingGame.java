package programmers.basic;

import java.util.Arrays;

public class MovingGame {
    public static int[] solution(String[] keyinput, int[] board) {
        int[] result = new int[2];

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                result[0]--;

                if ((board[0] / 2 * -1) > result[0]) {
                    result[0] = (board[0] / 2 * -1);
                }
            } else if (keyinput[i].equals("right")) {
                result[0]++;

                if ((board[0] / 2) < result[0]) {
                    result[0] = (board[0] / 2);
                }
            } else if (keyinput[i].equals("up")) {
                result[1]++;

                if ((board[1] / 2) < result[1]) {
                    result[1] = (board[1] / 2);
                }
            } else if (keyinput[i].equals("down")) {
                result[1]--;

                if ((board[1] / 2 * -1) > result[1]) {
                    result[1] = (board[1] / 2 * -1);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7,9}));
    }
}
