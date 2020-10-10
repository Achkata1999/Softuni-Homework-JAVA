import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int energy = Integer.parseInt(scan.nextLine());

        int wonBattle = 0;
        boolean finish = true;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("End of battle")) {
                break;
            }
            int distance = Integer.parseInt(input);

            if (distance > energy) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattle, energy);
                finish = false;
                break;
            } else {
                energy -= distance;
                wonBattle++;
            }

            if (wonBattle % 3 == 0) {
                energy += wonBattle;
            }
        }
        if (finish) {
            System.out.printf(      "Won battles: %d. Energy left: %d", wonBattle, energy);
        }
    }
}
