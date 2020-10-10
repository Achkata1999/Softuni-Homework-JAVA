import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        while (true) {
            String second = scan.nextLine();

            if (second.equals("End")) {
                break;
            }

            int index = Integer.parseInt(second);

            if (index > numbers.length - 1) {
                continue;
            }

            if (numbers[index] == -1) {
                continue;
            }

            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] == -1) {
                    continue;
                }

                if (index == i) {
                    continue;
                }

                if (numbers[index] >= numbers[i]) {
                    numbers[i] += numbers[index];
                } else {
                    numbers[i] -= numbers[index];

                }


            }
            numbers[index] = -1;
            counter++;
        }
        System.out.printf("Shot targets: %d -> ", counter);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
