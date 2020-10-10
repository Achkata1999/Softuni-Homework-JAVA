import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            symbols.putIfAbsent(currentChar, 0);
            int counter = symbols.get(currentChar);
            symbols.put(currentChar, counter + 1);
        }

        for (Map.Entry<Character, Integer> symbol : symbols.entrySet()) {
            System.out.println(String.format("%s: %d time/s", symbol.getKey(), symbol.getValue()));
        }
    }
}
