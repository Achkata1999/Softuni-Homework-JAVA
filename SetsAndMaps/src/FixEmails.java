import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, String> emails = new LinkedHashMap<>();

        while (!input.equals("stop")) {

            String name = input;
            String email = scan.nextLine();
            emails.put(name, email);

            input = scan.nextLine();
        }
        for (Map.Entry<String, String> email : emails.entrySet()) {
            if (email.getValue().contains(".com") || email.getValue().contains(".us") || email.getValue().contains(".uk")) {
                emails.remove(email);
            } else {
                System.out.println(email.getKey() + " -> " + email.getValue());
            }

        }
    }
}
