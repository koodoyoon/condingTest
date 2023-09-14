package programmers.basic;

import java.util.ArrayList;

public class OxQuiz {
    public static ArrayList solution(String[] quiz) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < quiz.length; i++) {
            String[] array = quiz[i].replace(" =","").split(" ");

            if (array[1].contains("-")) {
                if (Integer.parseInt(array[3]) == Integer.parseInt(array[0])-Integer.parseInt(array[2])) {
                    answer.add("O");
                } else answer.add("X");
            } else if (array[1].contains("+")) {
                if (Integer.parseInt(array[3]) == Integer.parseInt(array[0])+Integer.parseInt(array[2])) {
                    answer.add("O");
                } else answer.add("X");
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"}));
    }
}
