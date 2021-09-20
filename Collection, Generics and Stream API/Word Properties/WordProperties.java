import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Messing around with English words that contain five
 * distinct vowels from a text file using Streams
 *
 * Author: AnxietyMedicine (GitHub)
 */
public class WordProperties {
    public static void main(String[] args) throws IOException {
        String path = "words.txt";

        // how many are there?
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            long count = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(WordProperties::hasFiveVowels)
                    .count();

            System.out.println("Number of words with five vowels: " + count);
        }

        // show some examples (maybe 20)
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            List<String> examples = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(WordProperties::hasFiveVowels)
                    .limit(20)
                    .collect(Collectors.toList());

            System.out.println("\n20 words with all five vowels: " + examples);
        }

        // which is the shortest of the words?
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            String shortest = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(WordProperties::hasFiveVowels)
                    .min(Comparator.comparingInt(String::length))
                    .orElse("");

            System.out.println("\nShortest: " + shortest); // "Aurelio"
        }

        // are there any other words with the same length as the shortest?
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            List<String> allShortest = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(WordProperties::hasFiveVowels)
                    .filter(w -> w.length() == 7)
                    .collect(Collectors.toList());

            System.out.println("\nAll of that length: " + allShortest);
        }

        // what's the longest word with five vowels?
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            String longest = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(WordProperties::hasFiveVowels)
                    .max(Comparator.comparingInt(String::length))
                    .orElse("");

            System.out.println("\nLongest: " + longest);
        }
    }

    /**
     * Checks if a given string contains all five vowels
     * @param word the word to check
     * @return true if the word contains all five vowels
     */
    public static boolean hasFiveVowels(String word) {
        return word.toLowerCase().codePoints() // a stream of code points
        .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        .distinct()
        .count() == 5;
    }
}
