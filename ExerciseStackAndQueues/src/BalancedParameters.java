import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Character> openStack = new ArrayDeque<>();
        String input = scan.nextLine();

        boolean isRight = true;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (current == '{' || current == '[' || current == '(') {
                openStack.push(current);
            } else if (current == '}' || current == ']' || current == ')') {
                if (openStack.isEmpty()) {
                    isRight = false;
                    break;
                }
                char now = openStack.pop();
                if (current == '}' && now != '{') {
                    isRight = false;
                } else if (current == ')' && now != '(') {
                    isRight = false;
                } else if (current == ']' && now != '[') {
                    isRight = false;
                }
            }
        }
        if (isRight) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
