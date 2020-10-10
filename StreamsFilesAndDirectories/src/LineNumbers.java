import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Angel\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");

        List<String> lines = Files.readAllLines(path);

        PrintWriter writer = new PrintWriter("output.txt");
        int row = 1;

        for (String line : lines) {
            writer.println(row + ". " + line);
            row++;
        }

        writer.close();
    }
}
