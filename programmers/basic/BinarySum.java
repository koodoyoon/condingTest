package programmers.basic;

public class BinarySum {
    public static void main(String[] args) {
        System.out.println(solution("101", "1001"));
    }
    public static String solution(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        return Integer.toBinaryString(num1 + num2);
    }
}
