package programmers.basic;

import java.util.Arrays;

public class CompleteTriangle {

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        int num1 = (sides[1] - sides[0]);
        int num2 = sides[1] + sides[0];
        return num2 - num1 - 1;
    }

    public static void main(String[] args) {
        int[] a = {3, 6};
        System.out.println(solution(a));
    }
}
