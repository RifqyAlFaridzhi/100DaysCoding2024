package pkg100haringoding2;
import java.util.Scanner;

public class Day47 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int a = input.nextInt();
        
        if (a > 0) {
            System.out.println("Angka positif.");
        }

        if (a == 0) {
            System.out.println("Angka nol.");
        }

        if (a < 0) {
            System.out.println("Angka negatif.");
        }
    }
}
