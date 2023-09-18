package programmers.basic;

public class ParallelLines {
    public static double getSlope(int[] p1, int[] p2) {
        return (double) (p2[1] - p1[1]) / (p2[0] - p1[0]);
    }

    public static int solution(int[][] dots) {
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                for (int k = 0; k < dots.length - 1; k++) {
                    for (int l = k + 1; l < dots.length; l++) {
                        if (i == k || i == l || j == k || j == l) {
                            continue;
                        }

                        if (Math.abs(getSlope(dots[i], dots[j]) - getSlope(dots[k], dots[l])) < 1e-9) {
                            return 1;
                        }
                    }
                }
            }
        }

        return 0;
    }
    public static void main(String[] args) {

    }
}
