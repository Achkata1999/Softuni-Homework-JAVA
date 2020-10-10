    import java.util.Scanner;

    public class ValidUsername {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String[] input = scan.nextLine().split(", ");

            for (String name : input) {
                if (isValidname(name)) {
                    System.out.println(name);
                }
            }
        }

        private static boolean isValidname(String name) {
            if (name.length() < 3 || name.length() > 16) {
                return false;
            }
            for (int i = 0; i < name.length(); i++) {
                char symbol = name.charAt(i);
                if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                    return false;
                }
            }
            return true;
        }
    }
