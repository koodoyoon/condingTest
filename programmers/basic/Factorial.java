package programmers.basic;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Solution(7));
    }
    public static int Solution(int n) {
        int i = 1;
        int factorial = 1;
        while (factorial <= n) {
            i++;
            factorial = factorial * i;
        }
        return i - 1;
    }
}
