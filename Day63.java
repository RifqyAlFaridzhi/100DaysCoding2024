package pkg100haringoding2;
import java.util.Scanner;

public class Day63 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 30; i++) {
            if (i == 15) {
                System.out.println("CONTINUE(MELANJUTKAN)");
                continue;       //berfungsi untuk melanjutkan loop yang di batasi.     
            }
            System.out.println(i);
        }
    }
}
