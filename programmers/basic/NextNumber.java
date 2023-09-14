package programmers.basic;

public class NextNumber {
    public static int solution(int[] common) {
        int answer = 0;

        if (common[1]-common[0] == common[2]-common[1]) {
            answer = common[common.length-1] + (common[2]-common[1]);
        } else if (common[1] / common[0] == common[2] / common[1]) {
            answer = common[common.length-1] * (common[2] /common[1]);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));
    }
}
