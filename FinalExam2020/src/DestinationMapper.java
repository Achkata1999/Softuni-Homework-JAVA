import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        String input = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        List<String> stops = new ArrayList<>();
        String output = "Destinations: ";


        while (matcher.find()) {
            stops.add(matcher.group("destination"));
            count += matcher.group("destination").length();

        }
        for (int i = 0; i < stops.size(); i++) {
            if (i == stops.size() - 1) {
                output += stops.get(i) + " ";
                break;
            }
            output += stops.get(i) + ", ";

        }

        System.out.println(output);
        System.out.println(String.format("Travel Points: %d", count));
    }
}
