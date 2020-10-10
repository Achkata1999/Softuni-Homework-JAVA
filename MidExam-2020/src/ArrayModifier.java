import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }
        String comands = scan.nextLine();
        while (!comands.equals("end")) {
            String[] tokens = comands.split("\\s+");
            switch (tokens[0]) {
                case "swap": {

                    int index2 = Integer.parseInt(tokens[2]);
                    int index1 = Integer.parseInt(tokens[1]);
                    if (index2 > index1) {
                        int temp2 = numbers.remove(index2);
                        int temp1 = numbers.remove(index1);

                        numbers.add(index1, temp2);
                        numbers.add(index2, temp1);
                    } else {
                        int temp1 = numbers.remove(index1);
                        int temp2 = numbers.remove(index2);

                        numbers.add(index2, temp1);
                        numbers.add(index1, temp2);

                    }

                    break;
                }
                case "multiply": {
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    int sum = numbers.get(index1) * numbers.get(index2);
                    numbers.set(index1, sum);
                    break;
                }
                case "decrease":
                    for (int i = 0; i < numbers.size(); i++) {
                        int sum = numbers.get(i) - 1;
                        numbers.set(i, sum);
                    }
                    break;
            }
            comands = scan.nextLine();
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
                break;
            }
            System.out.print(numbers.get(i) + ", ");

        }
    }
}
