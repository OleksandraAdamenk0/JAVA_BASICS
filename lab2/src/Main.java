import Task1.TaskOne;
import Task2.TaskTwo;
import Task3.TaskThree;
import Task4.TaskFour;
import Task5.TaskFive;

public class Main {
    public static void main(String[] args) {
        System.out.println("First task:");
        TaskOne.main(args);
        System.out.println("=".repeat(200));

        System.out.println("Second task:");
        TaskTwo.main(args);
        System.out.println("=".repeat(200));

        System.out.println("Third task:");
        TaskThree.main(args);
        System.out.println("=".repeat(200));

        System.out.println("Fourth task:");
        TaskFour.main(args);
        System.out.println("=".repeat(200));

        System.out.println("Fifth task:");
        TaskFive.main(args);
        System.out.println("=".repeat(200));

    }
}