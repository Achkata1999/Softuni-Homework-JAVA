import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long time = 8*3600 + 40*60 + 35;
        long h=time/3600;
        long m=time%3600/60;
        long s=time%60;

        System.out.println();
    }
}
