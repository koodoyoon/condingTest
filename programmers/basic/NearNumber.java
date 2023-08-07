package programmers.basic;

public class NearNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10,20,30},12));
    }
    public static int solution(int[] array, int n) {
        int answer = array[0];
        int minDifference = Math.abs(array[0] - n);

        for (int i = 1; i < array.length; i++) {
            int absDifference = Math.abs(array[i] - n);

            if (absDifference < minDifference || (absDifference == minDifference && array[i] < answer)) {
                answer = array[i];
                minDifference = absDifference;
            }
        }

        return answer;
    }
}
