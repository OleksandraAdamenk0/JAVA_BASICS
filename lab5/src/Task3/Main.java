package Task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    public static void task(String inputFN, String ascOutputFN,  String descOutputFN) throws IOException {
        // get length
        FileReader reader = new FileReader(inputFN);
        int count = 0;
        for (int ch = reader.read(); ch != -1; ch = reader.read()) if (ch == ' ') count++;
        reader.close();
        if (count == 0) return;

        Integer[] numbers = new Integer[count + 1];

        // read content
        reader = new FileReader(inputFN);
        StringBuilder numberBuilder = new StringBuilder();
        for (int ch = reader.read();; ch = reader.read()) {
            if (ch == -1 || !Character.isDigit(ch)) {
                numbers[count--] = Integer.parseInt(numberBuilder.toString());
                numberBuilder.setLength(0);
                if (ch == -1) break;
            } else numberBuilder.append((char) ch);
        }

        // write results
        Arrays.sort(numbers, new AscDigitSumComparator());
        try (PrintWriter writer = new PrintWriter(new FileWriter(ascOutputFN))) { for (int n : numbers) writer.print(n + " "); }
        catch (IOException e) { System.err.println("Write error: " + e.getMessage()); }

        Arrays.sort(numbers, new DescDigitSumComparator());
        try (PrintWriter writer = new PrintWriter(new FileWriter(descOutputFN))) { for (int n : numbers) writer.print(n + " "); }
        catch (IOException e) { System.err.println("Write error: " + e.getMessage()); }
    }

    public static void main(String[] args) throws IOException {
        task("lab5/src/Task3/input.txt", "lab5/src/Task3/ascOutput.txt", "lab5/src/Task3/descOutput.txt");
    }
}
