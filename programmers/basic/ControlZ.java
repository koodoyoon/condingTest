package programmers.basic;

public class ControlZ {
    public static void main(String[] args) {

    }
    public static int solution(String s) {
        String[] split = s.split(" ");
        int sum = 0;
        int lastNum = 0;

        for (String str : split) {
            if ("Z".equals(str)) {
                sum -= lastNum;
            } else {
                lastNum = Integer.parseInt(str);
                sum += lastNum;
            }
        }

        return sum;
    }
}
