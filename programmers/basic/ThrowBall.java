package programmers.basic;

public class ThrowBall {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}, 2)); // 3
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5)); // 3
        System.out.println(solution(new int[]{1, 2, 3}, 3)); // 2
    }
    public static int solution(int[] numbers, int k) {
        int currentIndex = 0;
        int throwCount = 0;

        while (throwCount < k) {
            throwCount++;
            if (throwCount == k) return numbers[currentIndex];

            currentIndex += 2;
            if (currentIndex >= numbers.length) {
                currentIndex = currentIndex - numbers.length;
            }
        }

        return -1;
    }
}
