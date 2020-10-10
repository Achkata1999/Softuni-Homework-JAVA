import java.io.InterruptedIOException;
import java.util.Scanner;

public class FavoriteMovie_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int rating = Integer.MIN_VALUE;
        String movie = "";
        while (true) {
            String films = scan.nextLine();
            counter++;
            if (films.equals("STOP")) {
                break;
            } else if (counter >= 7) {
                System.out.println("The limit is reached.");
                break;
            }
            int points = 0;
            for (int i = 0; i < films.length(); i++) {
                points += films.charAt(i);

                if (Character.isUpperCase(films.charAt(i))) {
                    points -= films.length();
                } else if(Character.isLowerCase(films.charAt(i))){
                    points -= films.length() * 2;
                }
            }
            if (points > rating) {
                rating = points;
                movie = films;
            }
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", movie, rating);
    }
}
