import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, Integer> mine = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String miner = input;
            int value = Integer.parseInt(scan.nextLine());
            mine.putIfAbsent(miner, 0);
            int currentSum=mine.get(miner);
            mine.put(miner,currentSum+value);


            input = scan.nextLine();
        }

        for (Map.Entry<String, Integer> stringEntry : mine.entrySet()) {
            System.out.println(stringEntry.getKey() + " -> " + stringEntry.getValue());
        }
    }
}
