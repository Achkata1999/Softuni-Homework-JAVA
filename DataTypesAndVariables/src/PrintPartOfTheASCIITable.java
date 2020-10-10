import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int f = Integer.parseInt(scan.nextLine());

        for (int i = n; i <= f; i++) {
            char s = (char) i;
            System.out.printf("%c ", s);
        }
    }
}
