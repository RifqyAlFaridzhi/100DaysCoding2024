package pkg100haringoding2;
import java.util.Scanner;

public class Day67 {
    
    public  void perjumlahan(int Var1, int Var2) {
        System.out.println("hasil perjumlahannya adalah: " + (Var1 + Var2));
    }

    public  void pengurangan(int Var1, int Var2) {
        System.out.println("hasil pengurangannya adalah: " + (Var1 - Var2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Day67 Varx = new Day67();

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
                Varx.perjumlahan(Var1, Var2);
            }
            else if (Var3.equalsIgnoreCase("pengurangan")) {
                Varx.pengurangan(Var1, Var2);
            }
    }
}
