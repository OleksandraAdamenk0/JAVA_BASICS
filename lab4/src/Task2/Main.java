package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        ArrayUtils.swapGroups(intArray, 0, 3, 2);
        System.out.println("After swapping groups 1, 2 and 4, 5: " + Arrays.toString(intArray));
        ArrayUtils.swapAdjacentPairs(intArray);
        System.out.println("After swapping pairs: " + Arrays.toString(intArray));
        ArrayUtils.replaceGroup(intArray, 2, new Integer[]{9, 9});
        System.out.println("After replacing: " + Arrays.toString(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("\nOriginal Double Array: " + Arrays.toString(doubleArray));
        ArrayUtils.swapGroups(doubleArray, 0, 2, 2);
        System.out.println("After swapping groups 1.1, 2, 2 and 3.3, 4.4: " + Arrays.toString(doubleArray));
        ArrayUtils.swapAdjacentPairs(doubleArray);
        System.out.println("After swapping pairs: " + Arrays.toString(doubleArray));
        ArrayUtils.replaceGroup(doubleArray, 1, new Double[]{8.8, 8.8});
        System.out.println("After replacing: " + Arrays.toString(doubleArray));

        String[] strArray = {"A", "B", "C", "D", "E", "F"};
        System.out.println("\nOriginal String Array: " + Arrays.toString(strArray));
        ArrayUtils.swapGroups(strArray, 0, 3, 2);
        System.out.println("After swapping groups A, B and D, E: " + Arrays.toString(strArray));
        ArrayUtils.swapAdjacentPairs(strArray);
        System.out.println("After swapping pairs: " + Arrays.toString(strArray));
        ArrayUtils.replaceGroup(strArray, 2, new String[]{"X", "Y"});
        System.out.println("After replacing: " + Arrays.toString(strArray));
    }
}
