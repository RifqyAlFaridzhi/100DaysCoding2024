package pkg100haringoding2;
import java.util.Scanner;

public class Day78 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("- segitiga");
        System.out.println("- kotak");
        for (;;) {
            System.out.print("masukkan pilihan bentuk(kalau mau mengakhiri pilihan masukkan X): ");
            String Str1 = input.next();
            if (Str1.equalsIgnoreCase("segitiga")) {
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
            else if (Str1.equalsIgnoreCase("kotak")) {
                    System.out.print("masukkan jumlah bintang: ");
                    int Var2 = input.nextInt();
                        for (int i = 1; i <= Var2; i++) {
                            for (int j = 1; j <= Var2; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println();
                        }
            }
            else if (Str1.equalsIgnoreCase("X")) {
                System.out.println("BERHENTI");
                break;
            }
            else {
                System.out.println("MASUKKAN YANG BENER!");
            }
        }
    }
}
