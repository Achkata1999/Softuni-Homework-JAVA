import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        int counter = 0;
        int longest = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            int seq = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    seq++;
                } else {
                    break;
                }
            }
            if (seq > counter) {
                counter = seq;
                longest = numbers[i];

            }
        }
        for (int i = 0; i < counter; i++) {
            System.out.print(longest + " ");
        }
    }
}
