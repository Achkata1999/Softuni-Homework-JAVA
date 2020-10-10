import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0; i<n; i++){
            int number = Integer.parseInt(scan.nextLine());
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
        }
        System.out.printf("Max number: %d\n",max);
        System.out.printf("Min number: %d\n",min);
    }
}
