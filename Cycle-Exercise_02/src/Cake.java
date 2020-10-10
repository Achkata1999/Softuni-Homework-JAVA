import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int cake = length * width;


        int sumPiece = 0;

        while (sumPiece <= cake) {
            String piece = scan.nextLine();

            if (piece.equals("STOP")) {
                if (sumPiece < cake) {
                    int all =cake-sumPiece;
                    System.out.printf("%d pieces are left.",all);
                }
                break;
            }
            sumPiece += Integer.parseInt(piece);
        }
        if (sumPiece > cake) {
            int all = sumPiece - cake;
            System.out.printf("No more cake left! You need %d pieces more.",all);
        }
    }
}
