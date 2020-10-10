import java.util.*;

public class Meals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, List<String>> likedMeals = new LinkedHashMap<>();

        int count = 0;

        while (!"Stop".equals(input)) {
            String[] tokens = input.split("-");
            String command = tokens[0];
            String guest = tokens[1];
            String meal = tokens[2];
            switch (command) {
                case "Like":
                    likedMeals.putIfAbsent(guest, new ArrayList<>());

                    List<String> guestMeals = likedMeals.get(guest);

                    if (!guestMeals.contains(meal)) {
                        guestMeals.add(meal);
                    }
                    likedMeals.put(guest, guestMeals);
                    break;
                case "Unlike":
                    if (!likedMeals.containsKey(guest)) {
                        System.out.println(String.format("%s is not at the party", guest));
                    } else {
                        List<String> meals = likedMeals.get(guest);
                        if (!meals.contains(meal)) {
                            System.out.println(String.format("%s doesn't have the %s in his/her collection", guest, meal));
                        } else {
                            count++;
                            System.out.println(String.format("%s doesn't like the %s.", guest, meal));
                            meals.remove(meal);
                            likedMeals.put(guest, meals);
                        }
                    }
                    break;
            }


            input = scan.nextLine();
        }
        likedMeals.entrySet()
                .stream()
                .sorted((l1, l2) -> {
                    int res = l2.getValue().size() - l1.getValue().size();
                    if (res == 0) {
                        return l1.getKey().compareTo(l2.getKey());
                    } else {
                        return res;
                    }
                })
                .forEach(m -> System.out.println(m.getKey() + ": " + printList(m.getValue())));

        System.out.println("Unlike meals: " + count);
    }

    private static String printList(List<String> value) {
        return value.toString().replaceAll("[\\[\\]]", "");
    }
}
