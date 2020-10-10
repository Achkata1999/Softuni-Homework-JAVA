import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\Angel\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(path);

        PrintWriter writer = new PrintWriter("output.txt");

        for (String w : lines) {
            writer.println(w.toUpperCase());
        }
        writer.close();

    }
}
