import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        int multiply = Integer.parseInt(scan.nextLine());
        int rest = 0;

        if (multiply == 0) {
            System.out.println(0);
            return;
        }

        while (first.charAt(0) == 0) {
            first.substring(1);
        }

        StringBuilder sb = new StringBuilder();


        for (int i = first.length() - 1; i >= 0; i--) {
            int number = Integer.parseInt(String.valueOf(first.charAt(i)));
            int result = number * multiply + rest;
            rest = 0;

            if (result > 9) {
                rest = result / 10;
                result = result % 10;

            }
            sb.append(result);
        }
        if (rest != 0) {
            sb.append(rest);
        }
        System.out.println(sb.reverse());
    }
}
