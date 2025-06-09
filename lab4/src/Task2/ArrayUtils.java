package Task2;

public class ArrayUtils {

    public static <T> void swapGroups(T[] array, int from1, int from2, int length) {
        if (from1 + length > array.length || from2 + length > array.length) return;
        for (int i = 0; i < length; i++) {
            T temp = array[from1 + i];
            array[from1 + i] = array[from2 + i];
            array[from2 + i] = temp;
        }
    }

    public static <T> void swapAdjacentPairs(T[] array) {
        for (int i = 0; i < array.length - 1; i += 2) {
            T temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }

    public static <T> void replaceGroup(T[] array, int startIndex, T[] replacement) {
        if (startIndex + replacement.length > array.length) return;
        for (int i = 0; i < replacement.length; i++) array[startIndex + i] = replacement[i];
    }
}
