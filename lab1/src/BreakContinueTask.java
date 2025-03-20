import static java.lang.Double.NaN;

public class BreakContinueTask {
    private static double logic(double x, int n) {
        double result = 0;
        boolean error = false;
        label:
            for (int i = 1; i < n; i++) {
                double sum = 0;
                for (int j = 0; j <= n; j++) {
                    if (j + x == 0) {
                        error = true;
                        break label;
                    }
                    if (i == j + x) continue label;
                    sum += i / (j + x);
                }
                result = (result == 0) ? sum : result * sum;
            }
        return error ? NaN : result;
    }

    public static void task() {
        System.out.print("Input x: ");
        double x = Main.scanner.nextDouble();
        System.out.print("Input n: ");
        int n = Main.scanner.nextInt();
        double y = logic(x, n);
        if (Double.isNaN(y)) System.out.println("Error. Division by 0");
        else System.out.printf("y is equal to: %f\n", y);
    }
}
