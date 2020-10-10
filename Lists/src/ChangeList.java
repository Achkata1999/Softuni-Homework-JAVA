import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        while (true) {
            String comands = scan.nextLine();
            if (comands.equals("end")) {
                break;
            }
            String[] processes = comands.split("\\s+");

            if ("Delete".equals(processes[0])) {
                for (int i = 0; i < numbers.size(); i++) {
                    int digit = Integer.parseInt(processes[1]);
                    if (digit == numbers.get(i)) {
                        numbers.remove(Integer.valueOf(digit));
                    }
                }
            } else if ("Insert".equals(processes[0])) {
                int digit = Integer.parseInt(processes[1]);
                int index = Integer.parseInt(processes[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, digit);
                }
            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
