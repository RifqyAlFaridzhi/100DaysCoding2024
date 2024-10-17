package pkg100haringoding2;
import java.util.Scanner;

public class Day46 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan true/false: ");
        boolean a = input.nextBoolean();

        boolean hasil = !a;
        System.out.println("hasil notnya adalah: " + hasil);
    }
}
