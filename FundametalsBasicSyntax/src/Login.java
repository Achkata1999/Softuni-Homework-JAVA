    import java.util.Scanner;

    public class Login {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String user = scan.nextLine();
            String reverse = new StringBuffer(user).reverse().toString();
            String pass = scan.nextLine();
            int counter = 0;

            while (!pass.equals(reverse)) {
                counter++;
                if (counter >= 4) {
                    System.out.printf("User %s blocked!", user);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
                pass = scan.nextLine();
            }
            if (counter < 4) {
                System.out.printf("User %s logged in.", user);
            }
        }
    }
