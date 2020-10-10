import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        String one = input[0];
        String two = input[1];
        int max = Math.max(one.length(), two.length());
        int min = Math.min(one.length(), two.length());
        int big = one.length() - two.length();
        int result = 0;

        for (int i = 0; i < max; i++) {
            if (min > i) {
                result += one.charAt(i) * two.charAt(i);
            } else {
                if (big < 0) {
                    result += two.charAt(i);
                } else {
                    result += one.charAt(i);

                }
            }
        }
        System.out.println(result);
    }
}

