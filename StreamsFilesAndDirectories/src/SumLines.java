import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {


        Path path = Paths.get("C:\\Users\\Angel\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");


        List<String> lines = Files.readAllLines(path);

        PrintWriter writer = new PrintWriter("output.txt");

        lines.stream().map(String::toCharArray).forEach(l -> {
            int sum = 0;
            for (char c : l) {
                sum += c;
            }
            writer.println(sum);

        });
        writer.close();


    }
}
