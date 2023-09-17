package programmers.basic;

import java.util.ArrayList;
import java.util.Collections;

public class DuplicateLines {
    public static int solution(int[][] lines) {
        int answer = 0;

        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();

        for (int i = lines[0][0]; i <= lines[0][1]; i++) {
            array1.add(i);
        }

        for (int i = lines[1][0]; i <= lines[1][1]; i++) {
            array2.add(i);
        }

        for (int i = lines[2][0]; i <= lines[2][1]; i++) {
            array3.add(i);
        }
        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array3);

        ArrayList<Integer> dup1 = new ArrayList<>();
        ArrayList<Integer> dup2 = new ArrayList<>();
        ArrayList<Integer> dup3 = new ArrayList<>();

        int cnt = 0;

        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    cnt++;
                    dup1.add(i);
                }
            }
        }
        if (cnt < 2) {
            dup1.clear();
            cnt = 0;
        }
        System.out.println(dup1);

        for (int i : array1) {
            for (int j : array3) {
                if (i == j) {
                    cnt++;
                    dup2.add(i);
                }
            }
        }
        if (cnt < 2) {
            dup2.clear();
            cnt = 0;
        }
        System.out.println(dup2);

        for (int i : array2) {
            for (int j : array3) {
                if (i == j) {
                    cnt++;
                    dup3.add(i);
                }
            }
        }
        if (cnt < 2) {
            dup3.clear();
            cnt = 0;
        }
        System.out.println(dup3);

        for (int i : dup2) {
            if (!dup1.contains(i)) {
                dup1.add(i);
            }
        }

        for (int i : dup3) {
            if (!dup1.contains(i)) {
                dup1.add(i);
            }
        }

        System.out.println(dup1);

        Collections.sort(dup1);

        int idx = 0;

        if (!dup1.isEmpty()) {
            for (int i = dup1.get(0); i < dup1.size(); i++) {
                if (dup1.get(idx) - i != 0) {
                    answer -= 1;
                    break;
                }
                idx++;
            }
        }

        if (!dup1.isEmpty()) {
            answer += dup1.size()-1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0,8}, {0,2}, {6,8}}));
    }
}
