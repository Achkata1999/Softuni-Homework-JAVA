import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        if (figure.equals("square")){
            double side = Double.parseDouble(scan.nextLine());
            double area = side * side;
            System.out.printf("%.3f",area);

        }else if (figure.equals("rectangle")){
            double sidea = Double.parseDouble(scan.nextLine());
            double sideb = Double.parseDouble(scan.nextLine());
            double area = sidea * sideb ;
            System.out.printf("%.3f",area);

        }else if (figure.equals("circle")){
            double side = Double.parseDouble(scan.nextLine());
            double area = side * side * Math.PI;
            System.out.printf("%.3f",area);

        }else if (figure.equals("triangle")){
            double side = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());
            double area = side * height /2;
            System.out.printf("%.3f",area);
        }
    }
}
