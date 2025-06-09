package Task2;

public class Main {
    public static void main(String[] args) {
        Human[] people = new Human[] {
                new Human("Alex", 19),
                new Citizen("Maria", 23, "Ukraine"),
                new Student("John", 32, "America", "MIT"),
                new Employee("Anna", 81, "Germany", "BMW")
        };

        for (Human person : people) { System.out.println(person); }
    }
}
