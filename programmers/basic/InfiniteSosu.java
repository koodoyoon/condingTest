package programmers.basic;

public class InfiniteSosu {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int solution(int a, int b) {
        int greatestCommonDivisor = gcd(a, b);
        a /= greatestCommonDivisor;
        b /= greatestCommonDivisor;

        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        if (b == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(11, 22));
    }
}
