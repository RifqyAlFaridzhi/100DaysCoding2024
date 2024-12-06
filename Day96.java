package pkg100haringoding2;
import java.util.Scanner;

public class Day96 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah bintang: ");
        int Var1 = input.nextInt();

        for (int i = Var1; i > -0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = Var1; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < Var1; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = Var1; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
