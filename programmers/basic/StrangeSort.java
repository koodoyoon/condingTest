package programmers.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StrangeSort {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numlist.length; i++) {
            map.put(numlist[i]-n, numlist[i]);
        }
        for (int i = 0; i < numlist.length; i++) {
            System.out.println(map.get(Math.abs(numlist[i]-n)));
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10000,20,36,47,40,6,10,7000}, 30));
    }
}
