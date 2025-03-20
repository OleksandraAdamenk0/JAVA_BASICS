public class PowerOfEight {
    private static int arithmeticPower(int n) {
        if (n < 0 || n > 10) return -1;
        int result = 1;
        for (int i = 0; i < n; i++) result *= 8;
        return result;
    }

    private static int bitwisePower(int n) {
        if (n < 0 || n > 10) return -1;
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result << 3;
        }
        return result;
    }

    public static void task () {
        System.out.print("Arithmetic method:\n");
        System.out.print("Input n: ");
        int n = Main.scanner.nextInt();
        System.out.printf("8 in power of %d is %d\n", n, arithmeticPower(n));

        System.out.print("Bitwise method:\n");
        System.out.print("Input n: ");
        n = Main.scanner.nextInt();
        System.out.printf("8 in power of %d is %d\n", n, bitwisePower(n));
    }
}
