import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Широчина на свободното пространство - цяло число в интервала [1...1000]
        //2. Дължина на свободното пространство - цяло число в интервала [1...1000]
        //3. Височина на свободното пространство - цяло число в интервала [1...1000]
        //4. На следващите редове (до получаване на команда &quot;Done&quot;) - брой кашони, които се пренасят в
        //квартирата - цели числа в интервала [1...10000]
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int high = Integer.parseInt(scan.nextLine());
        int sum = width * length * high;
        String input = scan.nextLine();

        while (!input.equals("Done")) {
            sum-=Integer.parseInt(input);
            if(sum<0){
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(sum));
                break;
            }
            input = scan.nextLine();

        }
        if(input.equals("Done")){
            System.out.printf("%d Cubic meters left.",sum);
        }
    }
}
