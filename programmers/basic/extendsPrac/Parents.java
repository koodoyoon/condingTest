package programmers.basic.extendsPrac;

public class Parents {
    int member;
    String name;

    public void printFamily() {
        System.out.println("이름 : " + name);
        System.out.println("인원" + member);
    }
}

class Son extends Parents {

}
