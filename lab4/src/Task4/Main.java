package Task4;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your sentence:");
        String sentence = scanner.nextLine().toLowerCase();
        scanner.close();

        Pattern wordPattern = Pattern.compile("[a-zA-Z]+(?:'[a-zA-Z]+)?");
        Matcher matcher = wordPattern.matcher(sentence);

        SortedSet<String> uniqueWords = new TreeSet<>();
        while (matcher.find()) uniqueWords.add(matcher.group());

        System.out.println("Unique words in alphabetical order:");
        for (String word : uniqueWords) System.out.println(word);

    }
}

// Hello, my dear Friend! How are you? I'm good.
