import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] input = scan.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        String[] numbers = scan.nextLine().split("\\s+");

        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }


        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (!stack.isEmpty()) {
            if (stack.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(stackMinNumber(stack));
            }


        } else {
            System.out.println(0);
        }
    }

    public static int stackMinNumber(ArrayDeque<Integer> stack) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : stack) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;

    }
}
