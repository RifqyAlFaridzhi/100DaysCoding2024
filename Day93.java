package pkg100haringoding2;
import java.util.Scanner;

public class Day93 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah bintang: ");
        int Var1 = input.nextInt();

        for (int i = 1; i <= Var1; i++) {
            for (int j = Var1; j >= 1; j--) {
                if (j == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= Var1; j++) {
                if (j == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
