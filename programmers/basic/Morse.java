/*
    머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
    그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
    문자열 letter가 매개변수로 주어질 때,
    letter를 영어 소문자로 바꾼 문자열을
    return 하도록 solution 함수를 완성해보세요.
    모스부호는 다음과 같습니다.
    morse = {
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
}
 */
package programmers.basic;

import java.util.HashMap;
import java.util.Map;

public class Morse {
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
        // hello
    }
    public static String solution(String letter) {
        // 모스부호를 키와 밸류로 담는다.
        Map<String, Character> morse = new HashMap<>();
        morse.put(".-", 'a');
        morse.put("-...", 'b');
        morse.put("-.-.", 'c');
        morse.put("-..", 'd');
        morse.put(".", 'e');
        morse.put("..-.", 'f');
        morse.put("--.", 'g');
        morse.put("....", 'h');
        morse.put("..", 'i');
        morse.put(".---", 'j');
        morse.put("-.-", 'k');
        morse.put(".-..", 'l');
        morse.put("--", 'm');
        morse.put("-.", 'n');
        morse.put("---", 'o');
        morse.put(".--.", 'p');
        morse.put("--.-", 'q');
        morse.put(".-.", 'r');
        morse.put("...", 's');
        morse.put("-", 't');
        morse.put("..-", 'u');
        morse.put("...-", 'v');
        morse.put(".--", 'w');
        morse.put("-..-", 'x');
        morse.put("-.--", 'y');
        morse.put("--..", 'z');

        // 단어를 담을 스트링빌더 객체를 생성한다.
        StringBuilder result = new StringBuilder();

        // 부호 다음 공백을 기준으로 잘라서 스트링 빌더 객체 result에 담는다.
        String[] words = letter.split(" ");
        for (String word : words) {
            result.append(morse.get(word));
        }

        // 스트링빌더객체를 스트링으로 변환해서 리턴한다.
        return result.toString();
    }
}
