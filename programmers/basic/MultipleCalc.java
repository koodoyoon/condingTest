package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleCalc {
    public static String solution(String polynomial) {
        String[] array = polynomial.split(" ");
        ArrayList<String > x = new ArrayList<>();
        ArrayList<String > last = new ArrayList<>();
        int front = 0;
        int back = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("x")) {
                array[i] = array[i].replace("x","");
                x.add(array[i]);
            } else if (isInteger(array[i])) {
                last.add(array[i]);
            }
        }

        for (String xs : x) {
            if (xs.isEmpty()) {
                xs += "1";
            }
            front += Integer.parseInt(xs);
        }

        for (String l : last) {
            l.trim();
            back += Integer.parseInt(l);
        }

        if (back != 0) {
            if (front == 1) {
                return "x + " + back;
            } else if (front == 0) {
                return back+"";
            }
            return front+"x + "+back;
        } else if (back == 0) {
            if (front == 1) {
                return "x";
            }
        }

        return front+"x";
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("x + 0"));
    }
}
