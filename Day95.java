package pkg100haringoding2;
import java.util.Scanner;

public class Day95 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah bintang: ");
        int Var1 = input.nextInt();

        for (int i = 0; i < Var1; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < Var1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
