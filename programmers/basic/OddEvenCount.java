package programmers.basic;

import java.util.Arrays;

public class OddEvenCount {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even_count = 0, odd_count = 0; // 짝수와 홀수의 개수를 저장할 변수 선언

        // num_list의 각 원소를 반복문을 이용하여 검사
        for(int num : num_list) {
            if(num % 2 == 0) { // 짝수인 경우
                even_count++; // 짝수 개수 1 증가
            } else { // 홀수인 경우
                odd_count++; // 홀수 개수 1 증가
            }
        }

        // 계산된 짝수와 홀수의 개수를 answer 배열에 담아 반환
        answer[0] = even_count; // 짝수 개수
        answer[1] = odd_count; // 홀수 개수

        return answer;
    }
    public static void main(String[] args) {
        OddEvenCount oddEvenCount = new OddEvenCount();
        int[] num = {1,2,3,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(oddEvenCount.solution(num)));
    }
}
