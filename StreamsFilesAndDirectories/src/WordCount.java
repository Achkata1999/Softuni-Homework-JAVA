import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {

        Path first = Paths.get("C:\\Users\\Angel\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Path second = Paths.get("C:\\Users\\Angel\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");

        List<String> firstLines = Files.readAllLines(first);

        Map<String, Integer> allWords = new LinkedHashMap<>();
        for (String w : firstLines) {
            String[] words = w.split("\\s+");
            for (String word : words) {
                allWords.putIfAbsent(word, 0);
            }
        }
        List<String> secondLines = Files.readAllLines(second);

        for (String secondLine : secondLines) {
            String[] words = secondLine.split("\\s+");
            for (String word : words) {
                if (allWords.containsKey(word)) {
                    allWords.put(word, allWords.get(word) + 1);
                }
            }
        }
        PrintWriter writer = new PrintWriter("outfit.txt");
        allWords.entrySet().forEach(e -> writer.println(e.getKey() + " - " + e.getValue()));
        writer.close();

    }
}
