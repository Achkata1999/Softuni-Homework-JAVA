import java.util.Scanner;
import java.util.SortedMap;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double damageToHeigan = Double.parseDouble(scan.nextLine());
        int dimensionsOfArena = 15;

        int playerLife = 18500;
        double heiganLife = 3000000;
        int cloudDamage = 3500;
        int eruptions = 6000;

        String lastSpell = "";

        int[][] arena = new int[dimensionsOfArena][dimensionsOfArena];
        int playerStart1 = 7;
        int playerStart2 = 7;

        while (playerLife > 0 || heiganLife > 0) {
            if (playerLife <= 0) {
                break;
            }
            heiganLife -= damageToHeigan;


            String[] input = scan.nextLine().split("\\s+");
            String command = input[0];
            int hitRow = Integer.parseInt(input[1]);
            int hitCol = Integer.parseInt(input[2]);

            if (lastSpell.equals("Plague Cloud")) {
                playerLife -= cloudDamage;
            }
            if (heiganLife <= 0) {
                break;
            }

            if (isInDamageArea(hitRow, hitCol, playerStart1, playerStart2)) {
                if (!isInDamageArea(hitRow, hitCol, playerStart1 - 1, playerStart2) && playerStart1 >= 0) {
                    playerStart1--;
                    lastSpell = "";
                } else if (!isInDamageArea(hitRow, hitCol, playerStart1, playerStart2 + 1) && playerStart2 < dimensionsOfArena) {
                    playerStart2++;
                    lastSpell = "";
                } else if (!isInDamageArea(hitRow, hitCol, playerStart1 + 1, playerStart2) && playerStart1 <= dimensionsOfArena) {
                    playerStart1++;
                    lastSpell = "";
                } else if (!isInDamageArea(hitRow, hitCol, playerStart1, playerStart2 - 1) && playerStart2 >= 0) {
                    playerStart2--;
                    lastSpell = "";
                } else {
                    switch (command) {
                        case "Cloud":
                            playerLife -= cloudDamage;
                            lastSpell = "Plague Cloud";
                            break;

                        case "Eruption":
                            playerLife -= eruptions;
                            lastSpell = "Eruption";
                            break;
                    }
                }
            }
        }
        if (heiganLife <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f\n", heiganLife);
        }
        if (playerLife <= 0) {
            System.out.printf("Player: Killed by %s\n", lastSpell);
        } else {
            System.out.println("Player: " + playerLife);
        }
        System.out.println("Final position: " + playerStart1 + ", " + playerStart2);
    }

    private static boolean isInDamageArea(int hitRow, int hitCol, int moveRow, int moveCol) {
        return (moveRow >= hitRow - 1 && moveRow <= hitRow + 1) && (moveCol >= hitCol - 1 && moveCol <= hitCol + 1);
    }
}
