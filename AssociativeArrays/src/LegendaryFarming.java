import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> legendary = new LinkedHashMap<>();
        Map<String, Integer> junk = new LinkedHashMap<>();

        legendary.put("shards", 0);
        legendary.put("fragments", 0);
        legendary.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            String[] input = scan.nextLine().split("\\s+");
            for (int i = 0; i < input.length; i += 2) {
                int parts = Integer.parseInt(input[i]);
                String item = input[i + 1].toLowerCase();
                if (legendary.containsKey(item)) {
                    addMap(legendary, item, parts);
                    if (legendary.get(item) >= 250) {
                        obtained(legendary, item);
                        isObtained = true;
                        break;
                    }
                } else {
                    addMap(junk, item, parts);

                }

            }
        }
        System.out.println();

    }

    private static void obtained(Map<String, Integer> legendary, String item) {
        int newParts = legendary.get(item) - 250;
        legendary.put(item, newParts);

        switch (item) {
            case "shards":
                System.out.println("Shadowmourne obtained!");

                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }


    }

    private static void addMap(Map<String, Integer> map, String item, int parts) {
        map.putIfAbsent(item, 0);
        int newParts = map.get(item) + parts;
        map.put(item, newParts);
    }
}
