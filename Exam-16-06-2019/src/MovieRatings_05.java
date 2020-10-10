import java.util.Scanner;

public class MovieRatings_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double min = Double.MAX_VALUE;
        String minFilm = "";
        double max = Double.MIN_VALUE;
        String maxFilm = "";
        double all = 0;


        for (int i = 0; i < n; i++) {
            String film = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());
            all += rating;
            if (rating < min) {
                min = rating;
                minFilm = film;
            }
            if (rating > max) {
                max = rating;
                maxFilm = film;
            }
        }

        System.out.printf("%s is with highest rating: %.1f\n", maxFilm, max);
        System.out.printf("%s is with lowest rating: %.1f\n", minFilm, min);
        System.out.printf("Average rating: %.1f", all / n);
    }
}
