package programmers.basic.interfacePrac;

public class Dog implements Animal {

    @Override
    public void move() {
        System.out.println("네발로 뛴다");
    }

    @Override
    public void eat() {
        System.out.println("혀로 핥아 먹는다");
    }

    @Override
    public void bark() {
        System.out.println("멍멍 짖는다");
    }
}
