package Articles2_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Articles2_0> article = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(", ");

            String title = input[0];
            String content = input[1];
            String author = input[2];

            Articles2_0 articles = new Articles2_0(title, content, author);

            article.add(articles);
        }
        String command = scan.nextLine();
        switch (command) {
            case "title":
//              people.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
                article.stream().sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())).forEach(a -> System.out.println(a.getTitle() + " - " + a.getContent() + ": " + a.getAuthor()));
                break;
            case "content":
                article.stream().sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent())).forEach(a -> System.out.println(a.getTitle() + " - " + a.getContent() + ": " + a.getAuthor()));

                break;
            case "author":
                article.stream().sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor())).forEach(a -> System.out.println(a.getTitle() + " - " + a.getContent() + ": " + a.getAuthor()));

                break;
        }
    }
}
