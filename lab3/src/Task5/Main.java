package Task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.1);
        Circle c2 = new Circle(1.2);
        Circle c3 = new Circle(3.4);

        Circle[] arr = {c1, c2, c3};

        for (int i = 0; i < 3; i++) { System.out.printf("1: %f", arr[i].getRadius()); }

        Arrays.sort(arr);
        System.out.println("\nSorted: ");

        for (int i = 0; i < 3; i++) { System.out.printf("1: %f", arr[i].getRadius()); }

    }
}
