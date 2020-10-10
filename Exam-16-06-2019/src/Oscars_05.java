import java.util.Scanner;

public class Oscars_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actors = scan.nextLine();
        double point = Double.parseDouble(scan.nextLine());
        int jury = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < jury; i++) {
            String nameJury = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());

            point += nameJury.length() * rating / 2;
            if (point > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actors, point);
                break;
            }
        }
        if (point <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actors, 1250.5 - point);

        }
    }

}
