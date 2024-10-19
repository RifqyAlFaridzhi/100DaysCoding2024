package pkg100haringoding2;
import java.util.Scanner;

public class Day48 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai: ");
        int a = input.nextInt();

            if (a >= 60 && a <= 100) {
                System.out.println("Lulus (nice)");
            }
            else {
                System.out.println("Gagal (NT)");
            }
    }
}
