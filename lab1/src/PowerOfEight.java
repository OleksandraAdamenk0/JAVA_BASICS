public class PowerOfEight {
    private static void arithmeticPower(int n) {
        if (n < 0 || n > 10) return;
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= 8;
            String binaryResult = Integer.toBinaryString(result);
            System.out.printf("%d - ", result);
            System.out.println(binaryResult);
        }
    }

    private static void bitwisePower(int n) {
        if (n < 0 || n > 10) return;
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result << 3;
            String binaryResult = Integer.toBinaryString(result);
            System.out.printf("%d - ", result);
            System.out.println(binaryResult);
        }
    }

    public static void task () {
        System.out.print("Arithmetic method:\n");
        System.out.print("Input n: ");
        int n = Main.scanner.nextInt();
        arithmeticPower(n);

        System.out.print("Bitwise method:\n");
        System.out.print("Input n: ");
        n = Main.scanner.nextInt();
        bitwisePower(n);
    }
}
