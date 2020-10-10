import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        int capacity = Integer.parseInt(scan.nextLine());

        List<Integer> train = new ArrayList<>();

        for (String s : input) {
            train.add(Integer.parseInt(s));
        }
        while (true) {
            String comand = scan.nextLine();

            if (comand.equals("end")) {
                break;
            }
            String[] proces = comand.split(" ");
            if (proces[0].equals("Add")) {
                train.add(Integer.parseInt(proces[1]));
            } else {
                int peopleAdd = Integer.parseInt(proces[0]);
                for (int wagon = 0; wagon < train.size(); wagon++) {
                    int sum = train.get(wagon) + peopleAdd;
                    if (sum <= capacity) {
                        train.set(wagon, sum);
                        break;
                    }
                }
            }
        }
        for (Integer integer : train) {
            System.out.print(integer + " ");
        }

    }
}
