import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            int number= Integer.parseInt(scan.nextLine());
            if(number%2==0){
                a+=1;
            }
            if(number%3==0){
                b+=1;
            }
            if(number%4==0){
                c+=1;
            }
        }
        double p1 = a*1.0/n*100;
        double p2 = b*1.0/n*100;
        double p3 = c*1.0/n*100;
        char p = '%';

        System.out.printf("%.2f%c\n",p1,p);
        System.out.printf("%.2f%c\n",p2,p);
        System.out.printf("%.2f%c\n",p3,p);
    }
}
