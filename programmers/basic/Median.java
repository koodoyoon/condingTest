package programmers.basic;

import java.util.*;

public class Median {
    public int solution(int[] array) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(array);

        // 중앙값 구하기
        int medianIndex = array.length / 2;
        int median = array[medianIndex];

        return median;
    }
    public static void main(String[] args) {
        Median median = new Median();
        int[] array = {1,13,7,9,11,19,21,33,55};
        int answer = median.solution(array);
        System.out.println(answer);
    }
}


