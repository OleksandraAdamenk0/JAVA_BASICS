public class Fibonacci {
    private static long logic(int n) {
        if (n <= 0 || n > 92) return 0;
        if (n <= 2) return 1;
        return logic(n - 1) + logic(n - 2);
    }

    private static int maxForInt() {
        int result = 1;
        long f = 1;
        long prev = 1;
        while (f <= Integer.MAX_VALUE) {
            result++;
            if (f + prev > Integer.MAX_VALUE) break;
            f += prev;
            prev = f - prev;

        }
        return result;
    }

    private static int maxForLong() {
        int result = 1;
        long f = 1;
        long prev = 1;
        while (f > 0) {
            result++;
            f += prev;
            prev = f - prev;
        }
        return result;
    }

    public static void task() {
        System.out.print("Input n: ");

        int n = Main.scanner.nextInt();
        long result = logic(n);
        if (result == 0) System.out.println("Error. Wrong input");
        else System.out.printf("%d-th Fibonacci number is equal to: %d%n\n", n, result);

        System.out.printf("Max n for Fibonacci in int is %d%n", maxForInt());
        System.out.printf("Max n for Fibonacci in long is %d%n", maxForLong());

    }
}
