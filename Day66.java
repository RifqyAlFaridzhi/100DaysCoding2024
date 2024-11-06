package pkg100haringoding2;
import java.util.Scanner;

public class Day66 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah bintang: ");
        int Var0 = input.nextInt();

            for (int i = 0; i < Var0; i++) {
                for (int j = 0; j < Var0; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }

        System.out.print("masukkan panjang persegi: ");
        int Var1 = input.nextInt();
        System.out.print("masukkan lebar persegi: ");
        int Var2 = input.nextInt();

            for (int i = 0; i < Var2; i++) {
                for (int j = 0; j < Var1; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
    }
}
