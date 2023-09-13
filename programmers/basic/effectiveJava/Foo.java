package programmers.basic.effectiveJava;

public class Foo {
    String name;
    String address;

    public Foo(String name) {
        this.name = name;
    }

    public static Foo withName(String name) {
        return new Foo(name);
    }

    public static void main(String[] args) {
        Foo foo = new Foo("Do Yoon");

        Foo foo1 = Foo.withName("Do Yoon");
    }
}
