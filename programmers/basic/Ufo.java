package programmers.basic;

public class Ufo {
    public static void main(String[] args) {
        String[] a = {"z", "d", "x"};
        String[] b = {"def", "dww", "dzx", "loveaw"};
        System.out.println(solution(a, b));
    }

    public static int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            int cnt = 0;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    cnt++;
                }
                if (cnt > spell.length) {
                    cnt = 0;
                }
                if (cnt == spell.length) {
                    return 1;
                }
            }
        }
        return 2;
    }
}
