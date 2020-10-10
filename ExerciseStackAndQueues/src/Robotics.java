import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(";");
        String[] time = scan.nextLine().split(":");

        long startTimeInSec = Integer.parseInt(time[0]) * 3600 + Integer.parseInt(time[1]) * 60 + Integer.parseInt(time[2]);


        Map<String, Integer> robots = addAllRobots(input);
        ArrayDeque<String> productsQueue = new ArrayDeque<>();
        String product = scan.nextLine();
        int[] workTime = new int[input.length];


        while (!product.equals("End")) {
            productsQueue.offer(product);
            product = scan.nextLine();
        }



        while (!productsQueue.isEmpty()) {
            String currentProduct = productsQueue.poll();
            startTimeInSec++;

            boolean isUsed = false;
            for (int robotTime = 0; robotTime < workTime.length; robotTime++) {
                if (workTime[robotTime] > 0) {
                    workTime[robotTime] -= 1;
                }
            }

            for (int i = 0; i < workTime.length; i++) {

                if (workTime[i] == 0) {

                    int counter = 0;
                    for (Map.Entry<String, Integer> robot : robots.entrySet()) {
                        if (counter == i) {
                            workTime[i] = robot.getValue();

                            long hour = startTimeInSec / 3600 % 24;
                            long minutes = startTimeInSec % 3600 / 60;
                            long sec = startTimeInSec % 60;


                            System.out.printf("%s - %s [%02d:%02d:%02d]\n", robot.getKey(), currentProduct, hour, minutes, sec);
                            isUsed = true;
                            break;
                        }
                        counter++;
                    }
                    break;
                }
            }
            if (!isUsed) {
                productsQueue.offer(currentProduct);
            }

        }


    }

    private static Map<String, Integer> addAllRobots(String[] input) {
        Map<String, Integer> robots = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String[] rob = input[i].split("-");
            String name = rob[0];
            int time = Integer.parseInt(rob[1]);

            robots.put(name, time);

        }
        return robots;
    }
}
