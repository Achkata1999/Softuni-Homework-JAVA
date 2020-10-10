import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        List<Integer> end = new ArrayList<>();

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }
        int allNumbers = 0;
        for (int i = 0; i < numbers.size(); i++) {
            allNumbers += numbers.get(i);
        }
        double avg = allNumbers * 1.0 / numbers.size();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > avg) {
                end.add(numbers.get(i));
            }
        }
        end.sort(Collections.reverseOrder());

        if (end.size() == 0) {
            System.out.println("No");
        }

        for (int i = 0; i < end.size(); i++) {
            if (i > 4) {
                break;
            }
            System.out.print(end.get(i) + " ");
        }

    }
}
