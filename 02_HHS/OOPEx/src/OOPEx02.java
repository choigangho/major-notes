class Person2 {
    private String name;
    public int age;

    public Person2() {
        this("최강호", 20);
    }

    public Person2(int age, String name) {
        this(name, age);
    }

    public Person2(String name, int age) {
        this.name = name + "님";
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {
        Person2 p1 = new Person2("최강호", 25);
        Person2 p2 = new Person2("이상혁", 29);
        Person2 p3 = new Person2("김기인", 28);

        System.out.println(p1.getName() +" "+ p1.getAge() + "세");
        System.out.println(p2.getName() +" "+ p2.getAge() + "세");
        System.out.println(p3.getName() +" "+ p3.getAge() + "세");
    }
}