import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String student = scan.nextLine();
        double sum = 0;
        int year = 1;

        while (year<=12){
            double rating = Double.parseDouble(scan.nextLine());
            if(rating<4){
                continue;
            }
            sum+=rating;
            year++;
        }
        double price=sum/12;
        System.out.printf("%s graduated. Average grade: %.2f",student,price);


    }
}
