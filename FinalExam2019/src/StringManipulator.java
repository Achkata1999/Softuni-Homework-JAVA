import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String command = scan.nextLine();


        while (!"Finish".equals(command)) {
            String[] tokens = command.split("\\s+");
            String commandParts = tokens[0];

            switch (commandParts) {
                case "Replace":
                    input = replaceChar(input, tokens[1].charAt(0), tokens[2].charAt(0));
                    break;
                case "Cut":
                    input = cut(input, Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Make":
                    input = maker(input, tokens[1]);
                    break;
                case "Check":
                    input = checked(input, tokens[1]);
                    break;
                case "Sum":
                    sum(input, Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));

                    break;
            }
            command = scan.nextLine();
        }
    }

    private static void sum(String input, int startIndex, int stopIndex) {
        int sum = 0;
        if (input.length() - 1 >= startIndex && input.length() - 1 >= stopIndex) {
            for (int i = startIndex; i <= stopIndex; i++) {
                sum += input.charAt(i);
            }
        } else {
            System.out.println("Invalid indexes!");
        }
        System.out.println(sum);


    }

    private static String checked(String input, String token) {
        if (input.contains(token)) {
            System.out.println(String.format("Message contains %s", token));
        } else {
            System.out.println(String.format("Message doesn't contain %s", token));
        }
        return input;
    }

    private static String maker(String input, String token) {

        if ("Upper".equals(token)) {
            input = input.toUpperCase();

        } else {
            input = input.toLowerCase();

        }
        System.out.println(input);
        return input;
    }

    private static String cut(String input, int startIndex, int stopIndex) {

        if (input.length() - 1 >= startIndex && input.length() - 1 >= stopIndex) {
            for (int i = startIndex; i < stopIndex; i++) {
                input = input.substring(0, startIndex);
                input = input + input.substring(stopIndex + 1);
            }
            System.out.println(input);
        } else {
            System.out.println("Invalid indexes!");
        }
        return input;
    }

    private static String replaceChar(String input, char searchChar, char replacedChar) {
        input = input.replace(searchChar, replacedChar);

        System.out.println(input);
        return input;
    }
}
