import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int students = Integer.parseInt(scan.nextLine());
        int lecture = Integer.parseInt(scan.nextLine());
        int bonus = Integer.parseInt(scan.nextLine());
        double max = 0;
        int allLecture = 0;


        for (int i = 0; i < students; i++) {
            int plus = Integer.parseInt(scan.nextLine());

            double totalBonus = plus * 1.0 / lecture * (5 + bonus);
            if (totalBonus > max) {
                max = totalBonus;
                allLecture = plus;
            }

        }
        System.out.printf("Max Bonus: %d.\n", Math.round(max));
        System.out.printf("The student has attended %d lectures.", allLecture);
    }
}
