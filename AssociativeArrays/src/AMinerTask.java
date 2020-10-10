import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Map<String, Integer> resource = new LinkedHashMap<>();

        while (!"stop".equals(input)) {
            int count = Integer.parseInt(scan.nextLine());

            resource.putIfAbsent(input, 0);
            int newCount = resource.get(input) + count;
            resource.put(input, newCount);


            input = scan.nextLine();
        }
        resource.forEach((k, v) -> System.out.println(String.format("%s -> %d", k, v)));
    }
}
