import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int beginNumber = Integer.parseInt(scan.nextLine());
        int endNumber = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int end = 0;
        boolean print = false;

        for (int i = beginNumber; i <= endNumber; i++) {
            for (int j = beginNumber; j <= endNumber; j++) {
                end++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", end, i, j, magicNumber);
                    print = true;
                    break;
                }

            }
            if(print){
                break;
            }

        }
        if(!print){
            System.out.printf("%d combinations - neither equals %d",end,magicNumber);
        }
    }
}
