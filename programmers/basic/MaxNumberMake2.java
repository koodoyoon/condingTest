/*
    정수 배열 numbers가 매개변수로 주어집니다.
     numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을
     return하도록 solution 함수를 완성해주세요.
 */
package programmers.basic;

import java.util.*;

public class MaxNumberMake2 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = 0;
        int max1 = numbers[0] * numbers[1];
        int max2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        if (max1 < max2) {
            answer = max2;
        } else  {
            answer = max1;
        }
        return answer;
    }
    public static void main(String[] args) {
        MaxNumberMake2 maxNumberMake2 = new MaxNumberMake2();
        int[] array = {1,2,3,-3,-5,7,9};
        System.out.println(maxNumberMake2.solution(array));
    }
}
