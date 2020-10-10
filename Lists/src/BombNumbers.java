import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        String[] bombNumber = scan.nextLine().split("\\s+");
        int bomb = Integer.parseInt(bombNumber[0]);
        int radius = Integer.parseInt(bombNumber[1]);

        while (numbers.contains(bomb)) {
            int index = numbers.indexOf(bomb);

            int leftSide = Math.max(index - radius, 0);
            int rightSide = Math.min(index + radius, numbers.size() - 1);

            for (int i = rightSide; i >= leftSide; i--) {
                numbers.remove(i);
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
