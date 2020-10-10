import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int n =number;
        int fact = 0;
        int sum = 0;


        while (n > 0) {
            fact = n % 10;
            n /= 10;
            int counter = 1;
            for (int i = 1; i <= fact; i++) {
                counter *= i;
            }
            sum += counter;

        }
        if(number==sum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
