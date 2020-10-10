import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        while (true) {
            String comand = scan.nextLine();

            if (comand.equals("End")) {
                break;
            }

            String[] tokens = comand.split("\\s+");
            if (tokens[0].equals("Add")) {
                int number = Integer.parseInt(tokens[1]);
                numbers.add(number);
            } else if (tokens[0].equals("Insert")) {
                int number = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (tokens[0].equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");

                }

            } else if ((tokens[0] + " " + tokens[1]).equals("Shift left")) {
                int count = Integer.parseInt(tokens[2]);
                for (int i = 0; i < count; i++) {
                    int temp = numbers.remove(0);
                    numbers.add(temp);
                }

            } else if ((tokens[0] + " " + tokens[1]).equals("Shift right")) {
                int count = Integer.parseInt(tokens[2]);
                for (int i = 0; i < count; i++) {
                    int temp = numbers.remove(numbers.size() - 1);
                    numbers.add(0, temp);
                }
            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
