import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double counter = 0;
        String win = "";


        for (int i = 0; i < n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double sum = Math.PI * radius * radius * height;

            if (sum > counter) {
                counter = sum;
                win = model;
            }
        }
        System.out.println(win);
    }
}
