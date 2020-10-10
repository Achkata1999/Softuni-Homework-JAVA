import java.util.Scanner;

public class FitnessCard_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Сумата, с която разполагаме - реално число в интервала [10.00…1000.00]
        // Пол - символ ('m' за мъж и 'f' за жена)
        // Възраст - цяло число в интервала [5…105]
        // Спорт - текст (една от възможностите в таблицата)
        double money = Double.parseDouble(scan.nextLine());
        char sex = scan.nextLine().charAt(0);
        int year = Integer.parseInt(scan.nextLine());
        String sport = scan.nextLine();

        double sum = 0;

        switch (sport) {
            case "Gym":
                if (sex == 'm') {
                    sum += 42;
                } else {
                    sum += 35;
                }
                break;
            case "Boxing":
                if (sex == 'm') {
                    sum += 41;
                } else {
                    sum += 37;
                }
                break;
            case "Yoga":
                if (sex == 'm') {
                    sum += 45;
                } else {
                    sum += 42;
                }
                break;
            case "Zumba":
                if (sex == 'm') {
                    sum += 34;
                } else {
                    sum += 31;
                }
                break;
            case "Dances":
                if (sex == 'm') {
                    sum += 51;
                } else {
                    sum += 53;
                }
                break;
            case "Pilates":
                if (sex == 'm') {
                    sum += 39;
                } else {
                    sum += 37;
                }
                break;
        }
        if (year < 20) {
            sum -= sum * 0.2;
        }
        if (money >= sum) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.",sum - money);
        }


    }
}
