import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int money = Integer.parseInt(scan.nextLine());

        for(int i =0;i<n;i++){
            String web = scan.nextLine();
            switch (web) {
                case "Facebook":
                    money -= 150;
                    break;
                case "Instagram":
                    money -= 100;
                    break;
                case "Reddit":
                    money -= 50;
                    break;
            }
            if(money<=0){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if(money>0)
        System.out.println(money);
    }
}
