import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MegeTwoFiles {
    public static void main(String[] args) throws IOException {


        Path path1 = Paths.get("C:\\Users\\Angel\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path path2 = Paths.get("C:\\Users\\Angel\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");


        PrintWriter writer = new PrintWriter("output.txt");

        List<String> first = Files.readAllLines(path1);
        List<String> second = Files.readAllLines(path2);

        for (String s : first) {
            writer.println(s);
        }
        for (String s : second) {
            writer.println(s);
        }
        writer.close();
    }
}
