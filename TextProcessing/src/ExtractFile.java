import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int slashIndex = input.lastIndexOf('\\');
        int pointIndex = input.lastIndexOf('.');

        String fileName = input.substring(slashIndex + 1, pointIndex);
        String type = input.substring(pointIndex + 1);

        System.out.println(String.format("File name: %s", fileName));
        System.out.println(String.format("File extension: %s", type));
    }
}
