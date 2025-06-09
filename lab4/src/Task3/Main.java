package Task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, -2, 0, 3, -4, 5);
        List<Double> doubleList = Arrays.asList(0.0, -1.5, 2.3, -3.3, 0.0);
        List<Float> floatList = Arrays.asList(1.1f, -2.2f, 3.3f, 0f);

        System.out.println("Integer List:");
        System.out.println("Index of first zero: " + NumberUtils.indexOfFirstZero(intList));
        System.out.println("Count of negative numbers: " + NumberUtils.countNegative(intList));
        System.out.println("Last negative number: " + NumberUtils.lastNegative(intList));

        System.out.println("\nDouble List:");
        System.out.println("Index of first zero: " + NumberUtils.indexOfFirstZero(doubleList));
        System.out.println("Count of negative numbers: " + NumberUtils.countNegative(doubleList));
        System.out.println("Last negative number: " + NumberUtils.lastNegative(doubleList));

        System.out.println("\nFloat List:");
        System.out.println("Index of first zero: " + NumberUtils.indexOfFirstZero(floatList));
        System.out.println("Count of negative numbers: " + NumberUtils.countNegative(floatList));
        System.out.println("Last negative number: " + NumberUtils.lastNegative(floatList));

    }
}
