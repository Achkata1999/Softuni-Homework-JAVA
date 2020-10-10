import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            int current = numbers[i];
            boolean isTop = true;
            for (int j = i + 1; j < numbers.length ; j++) {
                if (current <= numbers[j]) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(current + " ");
            }
        }
        System.out.println(numbers[numbers.length - 1]);
    }

}

