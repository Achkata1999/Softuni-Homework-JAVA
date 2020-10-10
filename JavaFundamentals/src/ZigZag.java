import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] first = new String[n];
        String[] second = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String firstEl = input[0];
            String secondEl = input[1];

            if (i % 2 == 0) {
                first[i] = firstEl;
                second[i] = secondEl;
            } else {

                first[i] = secondEl;
                second[i] = firstEl;
            }
        }
        System.out.println(String.join(" ", first));
        System.out.println(String.join(" ", second));

    }
}
