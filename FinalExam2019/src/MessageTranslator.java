import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String regex = "!(?<command>[A-Z][a-z][a-z][a-z]+)!:\\[(?<Message>[A-za-z]{8,})\\]";


        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("The message is invalid");
            } else {
                System.out.print(matcher.group("command") + ":");
                String message = matcher.group("Message");
                for (int j = 0; j < message.length(); j++) {
                    System.out.print(" " + (int) message.charAt(j));
                }
                System.out.println();

            }

        }
    }
}
