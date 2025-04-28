package Task1;

import java.util.Arrays;

public class TaskOne {

    private static int n = 4;
    private static int m = 5;
    final static String character = "N";

    private static void fillNunberArr(int[][] arr) {
        for (int i = 0; i < TaskOne.n; i++) for (int j = 0; j < TaskOne.m; j++) arr[i][j] = (int) (Math.random() * 23);
    }

    private static void fillStringArr(int[][] narr, String[] sarr) {
        for (int i = 0; i < TaskOne.m; i++) {
            int maxEl = -1;
            for (int j = 0; j < TaskOne.n; j++) if (narr[j][i] > maxEl) maxEl = narr[j][i];
            sarr[i] = character.repeat(maxEl);
        }
    }

    private static void printStringArr(String[] arr) {
        for (int i = 0; i < TaskOne.m; i++) System.out.printf("%s ", arr[i]);
        System.out.println();
    }

    private static void printNunberArr(int[][] arr) {
        for (int i = 0; i < TaskOne.n; i++) {
            for (int j = 0; j < TaskOne.m; j++) System.out.printf("%d ", arr[i][j]);
            System.out.println();
        }
    }

    private static void sortStringArr(String[] arr) {
        Arrays.sort(arr, (a, b) -> b.compareTo(a));
    }

    public static void main(String[] args) {
        int[][] numbers = new int[TaskOne.n][TaskOne.m];
        TaskOne.fillNunberArr(numbers);
//        printNunberArr(numbers);
        String[] strings = new String[TaskOne.m];
        fillStringArr(numbers, strings);
//        printStringArr(strings);
        sortStringArr(strings);
        printStringArr(strings);
    }
}
