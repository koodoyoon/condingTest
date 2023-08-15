package programmers.basic;

public class Seven {
    public static void main(String[] args) {
        int[] ar = {1,15,33,24,35,66,77};
        System.out.println(solution(ar));
    }
    public static int solution(int[] array) {
        int answer = 0;
        StringBuilder s = new StringBuilder();

        for (int j : array) {
            s.append(j);
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '7') {
                answer++;
            }
        }

        return answer;
    }
}
