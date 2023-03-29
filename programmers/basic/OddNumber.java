/*
    정수 n이 매개변수로 주어질 때,
     n 이하의 홀수가 오름차순으로 담긴 배열을
     return 하도록 solution 함수를 완성해주세요.
 */
package programmers.basic;

import java.util.Arrays;

public class OddNumber {
    public int[] solution(int n) {
        int cnt = (n+1)/2; // 홀수의 갯수
        int[] array = new int[cnt]; // 홀수의 갯수만큼의 배열
        // num 이 홀수, i 는 배열 인덱스
        for (int i = 0, num = 1; i < cnt; i++, num +=2) {
            array[i] += num;
        }
        return array;
    }
    public static void main(String[] args) {
        OddNumber oddNumber = new OddNumber();
        System.out.println(Arrays.toString(oddNumber.solution(10))); // 1 3 5 7 9
    }
}
