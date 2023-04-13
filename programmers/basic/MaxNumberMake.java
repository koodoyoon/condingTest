/*
    정수 배열 numbers가 매개변수로 주어집니다.
    numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을
    return하도록 solution 함수를 완성해주세요.
 */
package programmers.basic;

import java.util.Arrays;

public class MaxNumberMake {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 오름차순으로 정렬
        int answer = numbers[numbers.length-1] * numbers[numbers.length-2]; // -1을 한 최대값과 -2를 한 두번째 최대값 곱하기
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1}; // Arrays.sort() = {1,2,3,4,5}
        MaxNumberMake maxNumberMake = new MaxNumberMake();
        System.out.println(maxNumberMake.solution(array)); // 20
    }
}
