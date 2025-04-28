package Task2;

public class TaskTwo {
    public static final int size = 300;

    public static void main(String[] args) {
        int[] arr = new int[TaskTwo.size];
        for (int i = 0; i < TaskTwo.size; i++) arr[i] = i + 1;
        arr[0] = -1;
        for (int i = 1; i < TaskTwo.size; i++) {
            if ((i * 2 >= TaskTwo.size)) break;
            if (arr[i] < 0) continue;
            for (int j = 2; j < TaskTwo.size; j++) {
                if (arr[i] * j - 1 >= TaskTwo.size) break;
                arr[arr[i] * j - 1] = -1;
            }
        }
        for (int i = 0; i < TaskTwo.size; i++) if (arr[i] > 0) System.out.printf("%d ", arr[i]);
        System.out.println();
    }
}
