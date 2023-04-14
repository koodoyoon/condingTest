package programmers.basic;

public class ReverseChar {
    public String solution(String my_string) {
        String answer = new StringBuilder(my_string).reverse().toString();
        return answer;
    }
    public static void main(String[] args) {
        String chars = "jason";
        ReverseChar reverseChar = new ReverseChar();
        System.out.println(reverseChar.solution(chars)); // nosaj
    }
}
