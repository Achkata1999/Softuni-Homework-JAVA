import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\Angel\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(path);
        int counterVowels = 0;
        int counterConsonants = 0;
        int counterMarks = 0;


        String vowel = "aeoui";
        String marks = ".?!,";

        for (String line : lines) {
            String[] words = line.split("\\s+");

            for (String word : words) {
                for (char s : word.toCharArray()) {
                    if (vowel.contains(String.valueOf(s))) {
                        counterVowels++;
                    } else if (marks.contains(String.valueOf(s))) {
                        counterMarks++;
                    } else {
                        counterConsonants++;
                    }

                }
            }

        }
        System.out.println("Vowels: " + counterVowels);
        System.out.println("Consonants: " + counterConsonants);
        System.out.println("Punctuation: " + counterMarks);


    }
}
