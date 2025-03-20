package Task5;

public class Library {
    public static int booleanToInt(boolean value) {
        return value ? 1 : 0;
    }

    public static boolean intToBoolean(int value) {
        return value != 0;
    }

    public static double intToDouble(int value) {
        return switch (value) {
            case 0 -> 2;
            case 1 -> 4;
            case 2 -> 5;
            case 3 -> 3;
            case 4 -> 1;
            default -> value + Math.sin(value);
        };
    }
}
