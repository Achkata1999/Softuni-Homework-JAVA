import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        ArrayDeque<Integer> queue = new ArrayDeque<>();

        String[] input = scan.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        String[] numbers = scan.nextLine().split("\\s+");

        for (String number : numbers) {
            queue.offer(Integer.parseInt(number));
        }


        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if (!queue.isEmpty()) {
            if (queue.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(queueMinNumber(queue));
            }


        } else {
            System.out.println(0);
        }
    }

    public static int queueMinNumber(ArrayDeque<Integer> queue) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : queue) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;

    }
}

