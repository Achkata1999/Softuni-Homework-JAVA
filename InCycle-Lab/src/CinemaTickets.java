import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String film = scan.nextLine();
        int student = 0;
        int standard = 0;
        int kid = 0;
        char a = '%';

        while (!film.equals("Finish")) {
            int freePlace = Integer.parseInt(scan.nextLine());
            int busyPlace = 0;
            while (busyPlace < freePlace) {
                String typeTicket = scan.nextLine();
                if ("End".equals(typeTicket)) {
                    break;
                } else if ("student".equals(typeTicket)) {
                    student++;
                } else if ("standard".equals(typeTicket)) {
                    standard++;
                } else if ("kid".equals(typeTicket)) {
                    kid++;
                }
                busyPlace++;
            }
            double sum = busyPlace * 1.0 / freePlace * 100;
            System.out.printf("%s - %.2f%c full.\n", film, sum, a);
            film = scan.nextLine();
        }
        int allTickets = standard + student + kid;

        System.out.printf("Total tickets: %d\n", allTickets);
        System.out.printf("%.2f%c student tickets.\n", student * 1.0 / allTickets * 100, a);
        System.out.printf("%.2f%c standard tickets.\n", standard * 1.0 / allTickets * 100, a);
        System.out.printf("%.2f%c kids tickets.\n", kid * 1.0 / allTickets * 100, a);
    }
}
