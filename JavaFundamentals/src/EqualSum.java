import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        int[] numbers = new int[input.length];
        boolean legit = false;
        int num = 0;


        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < input.length; i++) {
            int leftSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }

            int rightSum = 0;

            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                legit = true;
                num = i;
                break;
            }
        }
        if (legit) {
            System.out.println(num);
        } else {
            System.out.println("no");
        }
    }
}
