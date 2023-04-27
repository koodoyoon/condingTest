/*
    정수 num과 k가 매개변수로 주어질 때,
    num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
    없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 */

package programmers.basic;

public class FindNumber { // 참 그지같이도 코드르 짰다. 이거는 코드를 줄여볼 수 있도록 해야겠다.
    public int solution(int num, int k) {
        int answer = 0;
        String s = num + "";
        int[] number = new int[s.length()];
        for (int i = s.length()-1; i >= 0; i--) {
            number[i] = num % 10;
            if (number[i] == k) {
                answer = i + 1;
            } else if (!s.contains(String.valueOf(k))) {
                return -1;
            }
            num = num/10;
        }
        return answer;
    }
}
