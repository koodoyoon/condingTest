package programmers.basic.interfacePrac;

public class Cat implements Animal {

    @Override
    public void move() {
        System.out.println("네발로 기어다닌다 ");
    }

    @Override
    public void eat() {
        System.out.println("꼭꼭 씹어 먹는다");
    }

    @Override
    public void bark() {
        System.out.println("냐옹");
    }
}
