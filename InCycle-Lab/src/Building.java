import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floor = Integer.parseInt(scan.nextLine());
        int room = Integer.parseInt(scan.nextLine());

        for (int i = floor; i >0 ; i--) {
            for (int j = 0; j <room ; j++) {
                if(i == floor){
                    System.out.printf("L%d%d ",i,j);
                }else if(i%2==0){
                    System.out.printf("O%d%d ",i,j);
                }else {
                    System.out.printf("A%d%d ",i,j);
                }

            }
            System.out.println();
            
        }
    }
}
