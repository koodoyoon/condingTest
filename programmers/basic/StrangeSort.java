package programmers.basic;

import java.util.Arrays;
import java.util.Comparator;

public class StrangeSort {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] array = new int[numlist.length][];

        for (int i = 0; i < numlist.length; i++) {
            array[i] = new int[]{numlist[i], Math.abs(numlist[i] - n)};
        }

        Arrays.sort(array, (o1, o2) -> o1[1] == o2[1] ? o2[0] - o1[0] : o1[1] - o2[1]);

        for (int i = 0; i < numlist.length; i++) {
            answer[i] = array[i][0];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10000,20,36,47,40,6,10,7000}, 30));
    }
}
