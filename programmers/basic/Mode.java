/*
    최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    정수 배열 array가 매개변수로 주어질 때,
    최빈값을 return 하도록 solution 함수를 완성해보세요.
    최빈값이 여러 개면 -1을 return 합니다.
 */
package programmers.basic;

import java.util.*;

public class Mode {
    public int findMode(int[] nums) {
        // 배열의 각 원소를 키(key)로, 해당 원소의 빈도수를 값(value)로 저장하는 HashMap
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0; // 최대 빈도수
        int mode = 0; // 최빈값

        // 각 원소를 순회하면서 빈도수를 증가시키고, 최빈값을 찾아냄
        for (int num : nums) {
            // map에서 num의 값을 키(key)로 갖는 값(value)을 가져오고, 없으면 0을 가져옴
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq); // map에 빈도수를 저장

            if (freq > maxFreq) {
                maxFreq = freq; // 최대 빈도수 갱신
                mode = num; // 최빈값 갱신
            } else if (freq == maxFreq) {
                mode = -1; // 최빈값이 여러 개인 경우 -1로 설정
            }
        }
        return mode; // 최빈값 반환
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,5};
        Mode mode = new Mode();
        System.out.println(mode.findMode(nums));
    }
}





