import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for(int i = 0;i<n;i++){
            int number = Integer.parseInt(scan.nextLine());
            sumLeft+=number;
        }
        for(int i = 0;i<n;i++){
            int number = Integer.parseInt(scan.nextLine());
            sumRight+=number;
        }
        if(sumLeft==sumRight){
            System.out.printf("Yes, sum = %d",sumLeft);
        }else {
            int sum = sumLeft-sumRight;
            System.out.printf("No, diff = %d",Math.abs(sum));
        }
    }
}
