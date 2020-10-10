import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max =Integer.MIN_VALUE;
        int a=1;
        while (a<=n){
            int number = Integer.parseInt(scan.nextLine());
            if(number>max){
                max=number;
            }
            a++;
        }
        System.out.println(max);
    }
}
