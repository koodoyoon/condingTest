package programmers.basic;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        int n = 2;

        System.out.println(Arrays.deepToString(new Solution().solution(num, n)));
    }

    static class Solution {
        public int[][] solution(int[] numList, int n) {
            // numList의 길이를 n으로 나누어 2차원 배열의 행의 수를 계산
            int rows = numList.length / n;
            // 정답을 저장할 2차원 배열을 생성
            int[][] answer = new int[rows][n];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < n; j++) {
                    // 원본 배열에서 적절한 위치의 원소를 가져와 2차원 배열에 배치
                    // i * n + j 계산은 현재 행과 열에 대응하는 원본 배열의 인덱스를 나타냄
                    answer[i][j] = numList[i * n + j];
                }
            }

            return answer;
        }
    }
}
