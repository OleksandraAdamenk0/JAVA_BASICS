package Task1;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    private static double function(double x) {
        final int n = 7;
        if (x > 5) return (Math.pow((x - 4), 1 / 3.0) / Math.pow(Math.E, x - 5) + 4);
        double y = 1;
        for (int i = 1; i <= n; i++)
            y *= Math.pow(Math.sin(x / 2 - 2.5), i);
        return y + x;
    }

    public static void main(String[] args) {
        System.out.print("Input start x: ");
        double startX = scanner.nextDouble();
        System.out.print("Input stop x: ");
        double stopX = scanner.nextDouble();
        System.out.print("Input step: ");
        double step = scanner.nextDouble();

        for (;startX <= stopX; startX+=step)
            System.out.printf("x = %f, y = %f\n", startX, function(startX));
    }
}
