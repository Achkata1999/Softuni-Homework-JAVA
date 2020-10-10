import java.util.Scanner;

public class TournamentOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());

        int wins = 0;
        int lose = 0;
        double sum = 0;

        for (int i = 0; i < days; i++) {
            double sumDay = 0;
            int winsDay = 0;
            int loseDay = 0;
            while (true) {
                String sport = scan.nextLine();
                if (sport.equals("Finish")) {
                    break;
                }
                String result = scan.nextLine();
                if (result.equals("win")) {
                    sumDay += 20;
                    winsDay++;
                } else {
                    loseDay++;
                }
            }
            if (winsDay > loseDay) {
                sumDay += sumDay * 0.1;
                wins++;
            } else {
                lose++;
            }
            sum += sumDay;
        }
        if (wins > lose) {
            System.out.printf("You won the tournament! Total raised money: %.2f", sum + sum * 0.2);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", sum);
        }
    }
}
