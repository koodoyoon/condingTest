package programmers.basic;

public class InstanceClass {
    public static void main(String[] args) {
        Abc abc = new Abc();
        abc.setName("구도윤");
        abc.setAge("28");
        System.out.println(abc.getName());
        System.out.println(abc.getAge());
        System.out.println(abc.coding());
    }
}
class Abc {
    private String name;
    private String age;
    public String coding() {
        return name+"은 코딩 중";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}
