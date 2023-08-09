package programmers.basic;

public class Emergency {
    public static void main(String[] args) {
        int[] n = {1,6,2,7,3,5,4};
        System.out.println(solution(n));
    }
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }
}
