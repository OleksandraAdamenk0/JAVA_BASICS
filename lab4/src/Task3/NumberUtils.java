package Task3;

import java.util.List;

public class NumberUtils {
    public static <T extends Number> int indexOfFirstZero(List<T> list) {
        for (int i = 0; i < list.size(); i++) if (list.get(i).doubleValue() == 0.0) return i;
        return -1;
    }

    public static <T extends Number> int countNegative(List<T> list) {
        int count = 0;
        for (T number : list) if (number.doubleValue() < 0.0) count++;
        return count;
    }

    public static <T extends Number> T lastNegative(List<T> list) {
        for (int i = list.size() - 1; i >= 0; i--) if (list.get(i).doubleValue() < 0.0) return list.get(i);
        return null;
    }
}
