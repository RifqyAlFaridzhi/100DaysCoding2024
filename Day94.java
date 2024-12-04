package pkg100haringoding2;
import java.util.Scanner;

public class Day94 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah bintang: ");
        int Var1 = input.nextInt();

        for (int i = 1; i <= Var1; i++) {
            for (int j = Var1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
