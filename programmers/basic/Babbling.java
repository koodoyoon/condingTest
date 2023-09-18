package programmers.basic;

public class Babbling {
    public static int solution(String[] babbling) {
        int answer = 0;

        for(int i = 0 ; i < babbling.length ; i++){
            String b = babbling[i];
            b = b.replace("aya","___");
            b = b.replace("ye","__");
            b = b.replace("woo","___");
            b = b.replace("ma","__");
            b = b.replace("_","");
            if(b.equals("")){
                answer = answer + 1;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(babbling1));  // 1

        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(babbling2));  // 3
    }
}
