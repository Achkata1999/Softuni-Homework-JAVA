import java.util.Scanner;

public class Cinema_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = Integer.parseInt(scan.nextLine());
        int counter = 0;
        int sum = 0;
        while (true) {
            String input = scan.nextLine();
            if (input.equals("Movie time!")) {
                System.out.printf("There are %d seats left in the cinema.\n", capacity - counter);
                break;
            }
            int people = Integer.parseInt(input);
            counter += people;
            if (counter > capacity) {
                System.out.println("The cinema is full.");
                break;
            } else {
                if (people % 3 == 0) {
                    sum += people * 5 - 5;
                } else {
                    sum += people * 5;
                }
            }
        }
        System.out.printf("Cinema income - %d lv.", sum);
    }

}
