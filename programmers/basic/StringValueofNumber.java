/*
    문자열 my_string이 매개변수로 주어질 때,
    my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를
    return 하도록 solution 함수를 작성해보세요.
 */
package programmers.basic;

import java.util.ArrayList;
import java.util.Collections;

public class StringValueofNumber {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                arrayList.add(Character.getNumericValue(c));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
    public static void main(String[] args) {
        StringValueofNumber stringValueofNumber = new StringValueofNumber();
        String string = "hi12392";
        System.out.println(stringValueofNumber.solution(string)); // [1, 2, 2, 3, 9]
    }
}
