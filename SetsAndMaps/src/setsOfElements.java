import java.util.*;

public class setsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int firstSet = Integer.parseInt(input[0]);
        int secondSet = Integer.parseInt(input[1]);

        Set<Integer> first = new LinkedHashSet<>();
        Set<Integer> second = new LinkedHashSet<>();

        for (int i = 0; i < firstSet; i++) {

            int number = Integer.parseInt(scan.nextLine());

            first.add(number);
        }
        for (int i = 0; i < secondSet; i++) {
            int number = Integer.parseInt(scan.nextLine());

            second.add(number);
        }

        first.retainAll(second);

        for (Integer s : first) {
            System.out.print(s + " ");
        }


    }
}
