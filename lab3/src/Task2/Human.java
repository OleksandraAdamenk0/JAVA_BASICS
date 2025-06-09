package Task2;

public class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { return "name='" + this.name + '\'' + ", age=" + this.age; }
}
