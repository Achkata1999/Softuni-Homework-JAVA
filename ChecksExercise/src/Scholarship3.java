import java.util.Scanner;

public class Scholarship3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary = Double.parseDouble(scan.nextLine());
        double rating = Double.parseDouble(scan.nextLine());
        double money = Double.parseDouble(scan.nextLine());
        double social = money * 0.35;
        double excellent = rating * 25;

        if (social <= excellent && rating >= 5.5) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellent));
        } else if (rating > 4.5 && salary < money) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
        } else if(rating>=5.5){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellent));
        }
        else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
