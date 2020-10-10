import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        printNum();
    }

    private static void printNum() {
        int number = Integer.MAX_VALUE;

        Scanner scan = new Scanner(System.in);
        int n = 0;
        for (int i = 0; i < 3; i++) {
            n = Integer.parseInt(scan.nextLine());


            if (n < number) {
                number = n;
            }
        }
        System.out.println(number);
    }


}
