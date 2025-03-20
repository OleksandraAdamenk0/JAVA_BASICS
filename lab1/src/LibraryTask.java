import Task5.Library;
import static Task5.Library.*;


public class LibraryTask {

    public static void checkRegularImport() {
        System.out.printf("""
                        Task 5 function booleanToInt:
                        \tinput: true \t output: %d
                        \tinput: false \t output: %d
                        Task 5 function intToBoolean:
                        \tinput: 5 \t output: %b
                        \tinput: -1 \t output: %b
                        \tinput: 0 \t output: %b
                        Task 5 function intToDouble:
                        \tinput: 0 \t output: %f
                        \tinput: 1 \t output: %f
                        \tinput: 2 \t output: %f
                        \tinput: 3 \t output: %f
                        \tinput: 4 \t output: %f
                        \tinput: 5 \t output: %f""",
                Library.booleanToInt(true),
                Library.booleanToInt(false),
                Library.intToBoolean(5),
                Library.intToBoolean(-1),
                Library.intToBoolean(0),
                Library.intToDouble(0),
                Library.intToDouble(1),
                Library.intToDouble(2),
                Library.intToDouble(3),
                Library.intToDouble(4),
                Library.intToDouble(5)
        );
    }

    public static void checkStaticImport() {
        System.out.printf("""
                        Task 5 function booleanToInt:
                        \tinput: true \t output: %d
                        \tinput: false \t output: %d
                        Task 5 function intToBoolean:
                        \tinput: 5 \t output: %b
                        \tinput: -1 \t output: %b
                        \tinput: 0 \t output: %b
                        Task 5 function intToDouble:
                        \tinput: 0 \t output: %f
                        \tinput: 1 \t output: %f
                        \tinput: 2 \t output: %f
                        \tinput: 3 \t output: %f
                        \tinput: 4 \t output: %f
                        \tinput: 5 \t output: %f""",
                booleanToInt(true),
                booleanToInt(false),
                intToBoolean(5),
                intToBoolean(-1),
                intToBoolean(0),
                intToDouble(0),
                intToDouble(1),
                intToDouble(2),
                intToDouble(3),
                intToDouble(4),
                intToDouble(5)
        );
    }

    public static void task() {
        checkRegularImport();
        System.out.println();
        checkStaticImport();
    }
}
