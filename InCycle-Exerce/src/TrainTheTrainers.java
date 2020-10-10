import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jury = Integer.parseInt(scan.nextLine());
        double avgAllPresentation = 0;
        int counter = 0;

        while (true) {
            String presentation = scan.nextLine();
            if (presentation.equals("Finish")) {
                break;
            }
            counter++;
            double ratingPresentation = 0;
            for (int i = 0; i < jury; i++) {
                double rating = Double.parseDouble(scan.nextLine());
                ratingPresentation += rating;
            }
            double avgPresentation = ratingPresentation / jury;
            avgAllPresentation += avgPresentation;
            System.out.printf("%s - %.2f.\n", presentation, avgPresentation);
        }
        System.out.printf("Student's final assessment is %.2f.", avgAllPresentation / counter);
    }
}
