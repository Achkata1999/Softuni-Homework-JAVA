import java.util.Scanner;

public class TrekkingMania_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groups = Integer.parseInt(scan.nextLine());

        int Musala = 0;
        int Monblan = 0;
        int Kilimanjaro = 0;
        int k2 = 0;
        int Everest = 0;
        int humans = 0;
        String percent = "%";

        for (int i = 0; i < groups; i++) {
            int people = Integer.parseInt(scan.nextLine());
            humans += people;
            if (people <= 5) {
                Musala += people;
            } else if (people <= 12) {
                Monblan += people;
            } else if (people <= 25) {
                Kilimanjaro += people;
            } else if (people <= 40) {
                k2 += people;
            } else {
                Everest += people;

            }

        }
        double sumMusala = Musala * 1.0 / humans * 100;
        double sumMonblan = Monblan * 1.0 / humans * 100;
        double sumKilimanjaro = Kilimanjaro * 1.0 / humans * 100;
        double sumK2 = k2 * 1.0 / humans * 100;
        double sumEverest = Everest * 1.0 / humans * 100;
        System.out.printf("%.2f%s\n", sumMusala, percent);
        System.out.printf("%.2f%s\n", sumMonblan, percent);
        System.out.printf("%.2f%s\n", sumKilimanjaro, percent);
        System.out.printf("%.2f%s\n", sumK2, percent);
        System.out.printf("%.2f%s\n", sumEverest, percent);
    }
}
