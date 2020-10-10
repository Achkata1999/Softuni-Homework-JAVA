    import java.util.Scanner;

    public class Renovation_04 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int high = Integer.parseInt(scan.nextLine());
            int wight = Integer.parseInt(scan.nextLine());
            int percent = Integer.parseInt(scan.nextLine());
            double totalPercent = percent / 100.0;
            double area = (high * wight) * 4 - (high * wight) * 4 * totalPercent;
            double totalArea = Math.ceil(area);

            while (true) {
                String input = scan.nextLine();
                if (input.equals("Tired!")) {

                    System.out.printf("%.0f quadratic m left.", totalArea);
                    break;
                }
                totalArea -= Integer.parseInt(input);
                if (totalArea < 0) {
                    System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(totalArea));
                    break;
                } else if (totalArea == 0) {
                    System.out.println("All walls are painted! Great job, Pesho!");
                    break;
                }

            }
        }
    }
