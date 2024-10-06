package pkg100haringoding;
import java.util.Scanner;

public class Day35 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka1: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka2: ");
        int angka2 = input.nextInt();

        System.out.println("Hasil perjumlahan adalah: " + (angka1+angka2) );
        System.out.println("Hasil pengurangan adalah: " + (angka1-angka2) );
     }
}
