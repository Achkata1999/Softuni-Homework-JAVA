import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int min =Integer.MAX_VALUE;
        int a=1;
        while (a<=n){
            int number = Integer.parseInt(scan.nextLine());
            if(number<min){
                min=number;
            }
            a++;
        }
        System.out.println(min);
    }
}
