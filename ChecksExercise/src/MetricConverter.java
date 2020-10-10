import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        String a = scan.nextLine();
        String b = scan.nextLine();
        if (a.equals("m")){
            if (b.equals("cm")){
                number*= 100;
            }else if(b.equals("mm")){
                number*=1000;
            }
        }
        if (a.equals("cm")){
            if (b.equals("mm")){
                number*= 10;
            }else if(b.equals("m")){
                number/=100;
            }
        }
        if (a.equals("mm")){
            if (b.equals("cm")){
                number/= 10;
            }else if(b.equals("m")){
                number/=1000;
            }
        }
        System.out.printf("%.3f",number);
    }
}
