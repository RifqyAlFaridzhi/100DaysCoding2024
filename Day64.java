package pkg100haringoding2;
import java.util.Scanner;

public class Day64 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int Var0 = input.nextInt();

        outLoop: // label loop
        for (int i = 1; i <= Var0; i++) {
            for (int j = 1; j <= Var0; j++) {
                if (i == 5 && j == 7) {
                    break outLoop; // menghentikan/keluar dari loop outloop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        System.out.println("stop");
    }
}
