package Task4;

import java.util.Scanner;

public class TaskFour {
    private static Scanner scanner = new Scanner(System.in);

    private static String expandString(String str, int value) {
        if (str.length() >= value) return str;
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        int places = words.length - 1;
        int dif = Math.abs(str.length() - value);
        if (places == 0) {
            result.append(" ".repeat(dif / 2));
            result.append(words[0]);
            result.append(" ".repeat(dif / 2));
            if (dif % 2 == 1) result.append(" ");
            return result.toString();
        }
        int onPlace = dif / places;
        int last = dif % places;


        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i == words.length - 1) break;
            result.append(" ");
            String toAdd = " ".repeat(onPlace);
            result.append(toAdd);
            if (last > 0) {
                result.append(" ");
                last--;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int value = TaskFour.scanner.nextInt();
        System.out.printf("%s\n", expandString(args[0], value));
    }
}
