package pkg100haringoding2;
import java.util.Scanner;

public class Day49 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int a = input.nextInt();

            if (a == 0) {
                System.out.println("nol");
            }
            else if (a >= 1 && a <= 1000) {
                System.out.println("nilai PLUS");
            }
            else if (a >= -1000 && a <= -1) {
                System.out.println("nilai MINES");
            }
            else if ( a != 1000) {
                System.out.println("di luar jangkauan");
            }
            else if (a != -1000) {
                System.out.println("di luar jangkauan");
            }
    }
}
