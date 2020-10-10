import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sum=0;

        while (!input.equals("Stop")){
            sum += Integer.parseInt(input);
            input = scan.nextLine();

        }
        System.out.println(sum);
    }
}
