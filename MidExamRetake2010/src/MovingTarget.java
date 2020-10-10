import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }
        String comands = scan.nextLine();
        while (!comands.equals("End")) {
            String[] tokens = comands.split("\\s+");
            int index = Integer.parseInt(tokens[1]);
            int second = Integer.parseInt(tokens[2]);

            if (index >= 0 && index < numbers.size()) {
                switch (tokens[0]) {
                    case "Shoot":
                        int points = numbers.get(index) - second;
                        if (points <= 0) {
                            numbers.remove(index);
                        } else {
                            numbers.set(index, points);
                        }
                        break;
                    case "Add":
                        numbers.add(index, second);
                        break;
                    case "Strike":
                        int left = index - second;
                        int right = index + second;
                        if (left < 0 || right > numbers.size()-1 ) {
                            System.out.println("Strike missed!");
                            continue;
                        } else {
                            for (int i = right; i >= left; i--) {
                                numbers.remove(i);
                            }
                        }
                        break;
                }
            } else if (tokens[0].equals("Add")) {
                System.out.println("Invalid placement!");
            }
            comands = scan.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
                break;
            }
            System.out.print(numbers.get(i) + "|");
        }
    }
}
