package pkg100haringoding2;
import java.util.Scanner;

public class Day67 {
    
    public static void perjumlahan(int Var1, int Var2) {
        System.out.println("hasil perjumlahannya adalah: " + (Var1 + Var2));
    }

    public static void pengurangan(int Var1, int Var2) {
        System.out.println("hasil pengurangannya adalah: " + (Var1 - Var2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka pertama: ");
        int Var1 = input.nextInt();
        System.out.print("masukkan angka kedua: ");
        int Var2 = input.nextInt();

        System.out.println("================================");
        System.out.println("pilih operasi!");
        System.out.println("perjumlahan");
        System.out.println("pengurangan");
        System.out.print("masukkan: ");
        String Var3 = input.next();

            if (Var3.equalsIgnoreCase("perjumlahan")) {
                perjumlahan(Var1, Var2);
            }
            else if (Var3.equalsIgnoreCase("pengurangan")) {
                pengurangan(Var1, Var2);
            }
    }
}
