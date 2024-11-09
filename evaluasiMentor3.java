package pkg100haringoding2;
import java.util.Scanner;

public class evaluasiMentor3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int a = input.nextInt();
        for (int i = 1; i <= a; i++) {                  
            for (int j = 1; j <= a; j++) {
                if (j == i) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
