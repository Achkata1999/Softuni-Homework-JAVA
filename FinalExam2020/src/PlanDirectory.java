import java.util.*;

public class PlanDirectory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> plants = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);
            plants.putIfAbsent(plant, 0);
            plants.put(plant, rarity);

        }
        String secondInput = scan.nextLine();

        Map<String, Double> ratingMap = new LinkedHashMap<>();

        while (!"Exhibition".equals(secondInput)) {
            String[] tokens = secondInput.split(": ");
            String command = tokens[0];
            String[] rest = tokens[1].split(" - ");

            switch (command) {
                case "Rate":
                    String plant = rest[0];
                    String count = rest[1];
                    double rating = Double.parseDouble(count);
                    ratingMap.putIfAbsent(plant, 0.0);
                    double newRating = ratingMap.get(plant) + rating;
                    ratingMap.put(plant, newRating);
                    break;
                case "Update":
                    String plant1 = rest[0];
                    String count1 = rest[1];
                    ratingMap.putIfAbsent(plant1, 0.0);
                    plants.putIfAbsent(plant1, Integer.parseInt(count1));
                    break;
                case "Reset":
                    String plant2 = rest[0];
                    ratingMap.putIfAbsent(plant2, 0.0);
                    ratingMap.replace(plant2, 0.0);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            secondInput = scan.nextLine();
        }

        Map<String,List<Double>> all =new HashMap<>();


        plants.entrySet().stream().sorted((p1, p2) -> p1.getValue().compareTo(p2.getValue()))
                .forEach(p -> System.out.println(String.format("%s; Rarity: %d; Rating", p.getKey(), p.getValue())));
    }
}

