import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\Angel\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");


        long sum = 0;

        PrintWriter writer = new PrintWriter("output.txt");

        byte[] value = Files.readAllBytes(path);
        for (byte b : value) {
            if (b == '\r' || b == '\n') {
                continue;
            }
            sum += b;
        }
        writer.println(sum);
        writer.close();

    }
}
