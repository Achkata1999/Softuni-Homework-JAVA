import java.util.Scanner;

public class EvenPowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 1;
        for (int i =0;i<=n;i+=2){
            System.out.println(sum);
            sum=sum*2*2;
        }
    }
}
