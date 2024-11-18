package pkg100haringoding2;
import java.util.Scanner;

public class Day78 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan pilihan ya/tidak: ");
        String Str1 = input.nextLine();

            if (Str1.equalsIgnoreCase("ya")) {
                System.out.println("anda mendapatkan kotak hehe: ");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            }
            else if (Str1.equalsIgnoreCase("tidak")) {
                System.out.println("OK");
            }
            else {
                System.out.println("--------------------------------");
            }
    }
}
