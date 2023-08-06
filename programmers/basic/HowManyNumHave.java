package programmers.basic;

public class HowManyNumHave {
    public static void main(String[] args) {
        System.out.println(solution(3,10,2));
    }
    public static int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++) {
            String numStr = Integer.toString(num);
            for (char c : numStr.toCharArray()) {
                if (c == (char)('0' + k)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
