import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int goal = 10000;
        int sum = 0;

        while (sum < goal) {
            String steps = scan.nextLine();
            if(steps.equals("Going home")){
                steps = scan.nextLine();
                sum+= Integer.parseInt(steps);
                if(sum<goal){
                    System.out.printf("%d more steps to reach goal.",goal-sum);
                }
                break;
            }
            sum+=Integer.parseInt(steps);
        }
        if(sum>=goal){
            System.out.println("Goal reached! Good job!");
        }
    }
}
