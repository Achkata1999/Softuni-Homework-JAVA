import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, String> phoneBook = new HashMap<>();

        while (!input.equals("search")) {

            String[] tokens = input.split("-");
            String name = tokens[0];
            String phone = tokens[1];
            phoneBook.putIfAbsent(name, "");
            phoneBook.put(name, phone);

            input = scan.nextLine();
        }

        input = scan.nextLine();

        while (!input.equals("stop")) {
            if (!phoneBook.containsKey(input)) {
                System.out.printf("Contact %s does not exist.\n", input);
            } else {
                System.out.println(input + " -> " + phoneBook.get(input));
            }

            input = scan.nextLine();
        }
    }
}
