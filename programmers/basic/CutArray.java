/*
    정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때
    numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을
    return 하도록 solution 함수를 완성해보세요.
 */
package programmers.basic;

import java.util.Arrays;

public class CutArray {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 자르려는 인덱스가 유효한지 체크
        if (num1 < 0 || num1 >= numbers.length || num2 < 0 || num2 >= numbers.length) {
            return new int[0]; // 유효하지 않으면 빈 배열 반환
        }
        // 자르려는 인덱스가 유효하면 배열을 자르고 반환
        int[] result = new int[num2 - num1 + 1]; // 자른 배열의 크기만큼 배열 생성
        for (int i = num1; i <= num2; i++) {
            result[i - num1] = numbers[i]; // 자른 배열에 numbers 배열의 값을 복사
        }
        return result;
    }

    public static void main(String[] args) {
        CutArray cutArray = new CutArray();
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(cutArray.solution(array, 1, 3))); // 2, 3, 4
    }
}
