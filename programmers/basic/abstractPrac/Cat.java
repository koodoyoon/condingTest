package programmers.basic.abstractPrac;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("냐옹");
    }
}
