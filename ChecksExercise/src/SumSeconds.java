import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        int p3 = Integer.parseInt(scan.nextLine());
        int sum = p1+p2+p3;
        int min = sum /60;
        int sec = sum %60;
        String second = "";
        if(sec<10){
            second =second +"0"+sec;
            System.out.println(min+":"+second);
        }else{
            System.out.println(min+":"+sec);
        }
    }
}
