import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if(number<200){
                a+=1;
            }else if(number<400){
                b+=1;
            }else if(number<600) {
                c += 1;
            }else if(number<800) {
                d += 1;
            }else{
                e+=1;
            }
        }
        double p1 =a*1.00 / n*100;
        double p2 =b*1.0 / n*100;
        double p3 =c*1.0 / n*100;
        double p4 =d*1.0 / n*100;
        double p5 =e*1.0 / n*100;
        char p = '%';

        System.out.printf("%.2f%c\n",p1,p);
        System.out.printf("%.2f%c\n",p2,p);
        System.out.printf("%.2f%c\n",p3,p);
        System.out.printf("%.2f%c\n",p4,p);
        System.out.printf("%.2f%c\n",p5,p);
    }
}
