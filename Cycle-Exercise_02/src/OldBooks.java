import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String book = scan.nextLine();
        int capacity = Integer.parseInt(scan.nextLine());
        int search = 1;

        while (search<=capacity){
            String manga =scan.nextLine();
            if(book.equals(manga)){
                search-=1;
                System.out.printf("You checked %d books and found it.",search);
                break;
            }
            search++;
        }
        if(search>capacity){
            search-=1;
            System.out.printf("The book you search is not here!\nYou checked %d books.",search);
        }
    }
}
