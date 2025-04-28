package Task3;

public class TaskThree {

    private static long[] fib = new long[94];
    private static int last = 1;

    static {
        fib[0] = 0;
        fib[1] = 1;
    }

    public static long fibonacci(int n) {
        for (int i = 2; i < 94; i++) fib[i] = fib[i - 2] + fib[i - 1];
        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(10));
    }
}
