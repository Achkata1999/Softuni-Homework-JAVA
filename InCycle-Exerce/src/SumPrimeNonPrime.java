import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int prime = 0;
        int nonPrime = 0;

        while (true) {
            String input = scan.nextLine();

            if (input.equals("stop")) {
                break;
            }

            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                prime += number;
            } else {
                nonPrime += number;
            }

        }
        System.out.printf("Sum of all prime numbers is: %d\n",prime);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrime);
    }
}
