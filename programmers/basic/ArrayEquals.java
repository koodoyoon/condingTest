/*
    두 배열이 얼마나 유사한지 확인해보려고 합니다.
    문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를
    return하도록 solution 함수를 완성해주세요.
 */
package programmers.basic;

public class ArrayEquals {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String i : s1) {
            for (String j : s2) {
                if (i.equals(j)) { // String을 비교할 때 equals를 사용
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrayEquals arrayEquals = new ArrayEquals();
        String[] array1 = {"a","b","c"};
        String[] array2 = {"aa","bb","cc","dd","b","c"};
        System.out.println(arrayEquals.solution(array1, array2)); // 2
    }
}
