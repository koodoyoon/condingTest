package programmers.basic;

public class PushString {
    public static int solution(String A, String B) {
        return (B+B).indexOf(A);
    }

    public static void main(String[] args) {
        System.out.println(solution("hello", "lohel"));
    }
}
