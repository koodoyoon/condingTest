/*
    정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
    num_list의 원소의 순서를 거꾸로 뒤집은 배열을
    return하도록 solution 함수를 완성해주세요.
 */
package programmers.basic;

import java.util.Arrays;

public class BackArray {
    public int[] solution(int[] num_list) {
        // 새로운 배열을 생성합니다.
        int[] result = new int[num_list.length];

        // 원래 배열의 마지막 인덱스부터 첫 번째 인덱스까지 반복하면서 값을 대입
        for (int i = 0; i < num_list.length; i++) {
            // 새로운 배열의 첫 번째 인덱스부터 마지막 인덱스까지 값을 대입
            // 원래 배열의 마지막 원소부터 첫 번째 원소까지 값을 대입
            result[num_list.length - 1 - i] = num_list[i];
        }
        // 새로운 배열을 반환합니다.
        return result;
    }
    public static void main(String[] args) {
        BackArray backArray = new BackArray();
        int[] i = {1,2,3,4,5};
        System.out.println(Arrays.toString(backArray.solution(i))); // 5,4,3,2,1
    }
}
