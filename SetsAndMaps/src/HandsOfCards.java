import java.sql.Array;
import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Set<String>> playerCards = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("JOKER")) {
            String[] tokens = input.split(": ");
            String name = tokens[0];
            String token = tokens[1];
            String[] hand = token.split(", ");
            Set<String> currentHandCards = new HashSet<>(Arrays.asList(hand));

            playerCards.putIfAbsent(name, currentHandCards);
            playerCards.get(name).addAll(currentHandCards);

            input = scan.nextLine();
        }
        for (Map.Entry<String, Set<String>> player : playerCards.entrySet()) {
            int points = calculatingPoints(player.getValue());

            System.out.println(player.getKey() + ": " + points);
        }


        System.out.println();
    }

    private static int calculatingPoints(Set<String> value) {
        int sum = 0;

        HashMap<Character, Integer> powers = cardsPower();
        for (String s : value) {
            if (s.contains("10")) {
                sum += 10 * powers.get(s.charAt(2));
                continue;
            }
            char first = s.charAt(0);
            char second = s.charAt(1);

            sum += powers.get(first) * powers.get(second);
        }

        return sum;
    }

    private static HashMap<Character, Integer> cardsPower() {
        HashMap<Character, Integer> powers = new HashMap<>();

        powers.put('1', 1);
        powers.put('2', 2);
        powers.put('3', 3);
        powers.put('4', 4);
        powers.put('5', 5);
        powers.put('6', 6);
        powers.put('7', 7);
        powers.put('8', 8);
        powers.put('9', 9);
        powers.put('J', 11);
        powers.put('Q', 12);
        powers.put('K', 13);
        powers.put('A', 14);
        powers.put('S', 4);
        powers.put('H', 3);
        powers.put('D', 2);
        powers.put('C', 1);

        return powers;

    }
}

