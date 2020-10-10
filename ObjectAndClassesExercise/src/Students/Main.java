package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Students> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String firstName = input[0];
            String secondName = input[1];
            double age = Double.parseDouble(input[2]);
            Students students = new Students(firstName, secondName, age);

            people.add(students);
        }
        //        people.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
        people.stream().sorted((p2, p1) -> Double.compare(p1.getGrade(), p2.getGrade())).forEach(p -> System.out.println(p.getFirstName() + " " + p.getSecondName() + ": " + p.getGrade()));
    }
}
