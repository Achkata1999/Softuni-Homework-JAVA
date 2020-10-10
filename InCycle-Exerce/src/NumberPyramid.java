import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int begin = 1;


        for (int rows = 1; rows <= number; rows++) {
            for (int cows = 1; cows <= rows; cows++) {
                System.out.printf("%d ",begin);
                begin++;
                if(begin>number){
                    break;
                }
            }
            if(begin>number){
                break;
            }
            System.out.println();
        }
    }
}
