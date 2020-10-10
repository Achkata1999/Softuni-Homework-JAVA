package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        int n = Integer.parseInt(scan.nextLine());

        String title = input[0];
        String content = input[1];
        String author = input[2];

        Articles articles = new Articles(title, content, author);

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(": ");
            String command = tokens[0];
            String data = tokens[1];

            switch (command) {
                case "Edit":
                    articles.setContent(data);
                    break;
                case "ChangeAuthor":
                    articles.setAuthor(data);
                    break;
                case "Rename":
                    articles.setTitle(data);
                    break;
            }

        }
        System.out.println(articles.toString());

    }
}
