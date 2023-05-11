/*
    머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
    피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
    n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
    최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

    입출력 예
    n	result
    6	1
    10	5
    4	2
 */
package programmers.basic;

public class MinimumPizza {
    public int solution(int n) {
        // 최소 피자 판 수를 저장하는 변수를 초기화 answer = 피자판 수
        int answer = 1;
        // 모든 사람이 같은 수의 피자 조각을 먹을 수 있는 최소 피자 판 수를 찾기
        while (true) {
            // 현재 피자 판 수에서 6조각을 나눠서 나머지가 0이면, n명이 동일한 조각 수로 나눌 수 있음
            if ((answer * 6) % n == 0) {
                // 최소 피자 판 수를 반환
                return answer;
            }
            // 최소 피자 판 수를 증가
            answer++;
        }
    }

    public static void main(String[] args) {
        MinimumPizza minimumPizza = new MinimumPizza();
        System.out.println(minimumPizza.solution(6)); // 1
        System.out.println(minimumPizza.solution(10)); // 5
        System.out.println(minimumPizza.solution(4)); // 2
    }
}
