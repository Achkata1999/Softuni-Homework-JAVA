import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();

        String[] one = first.split(" ");
        String[] two = second.split(" ");

        for (String elementsOne : two) {
            for (String elementsTwo : one) {
                if (elementsOne.equals(elementsTwo)) {
                    System.out.print(elementsOne + " ");
                }
            }
        }
    }
}
