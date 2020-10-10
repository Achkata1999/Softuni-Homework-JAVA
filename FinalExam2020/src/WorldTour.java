import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String travelsStop = scan.nextLine();

        String input = scan.nextLine();

        while (!"Travel".equals(input)) {
            String[] tokens = input.split(":");
            String command = tokens[0];

            switch (command) {
                case "Add Stop":
                    travelsStop = addStop(travelsStop, Integer.parseInt(tokens[1]), tokens[2]);
                    break;
                case "Remove Stop":
                    travelsStop = removeByIndex(travelsStop, Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Switch":
                    travelsStop = swichStop(travelsStop, tokens[1], tokens[2]);
                    break;
            }


            input = scan.nextLine();
        }
        System.out.println(String.format("Ready for world tour! Planned stops: %s", travelsStop));
    }

    private static String swichStop(String travelsStop, String oldString, String newString) {
        if (travelsStop.contains(oldString)) {
            travelsStop = travelsStop.replaceFirst(oldString, newString);
        }
        System.out.println(travelsStop);
        return travelsStop;
    }

    private static String removeByIndex(String travelsStop, int startIndex, int endIndex) {
        String newString = "";
        if (startIndex >= 0 && startIndex < travelsStop.length() && endIndex >= 0 && endIndex < travelsStop.length()) {
            newString = travelsStop.substring(0, startIndex);
            newString += travelsStop.substring(endIndex + 1);
        }
        travelsStop = newString;
        System.out.println(travelsStop);
        return travelsStop;

    }

    private static String addStop(String travelsStop, int index, String stop) {
        String newString = "";
        if (index >= 0 && index < travelsStop.length()) {
            newString = travelsStop.substring(0, index);
            newString += stop;
            newString += travelsStop.substring(index);
        }
        travelsStop = newString;
        System.out.println(travelsStop);
        return travelsStop;
    }
}
