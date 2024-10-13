package pkg100haringoding2;
import java.util.Scanner;

public class Day41 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai 1: ");
        int a = input.nextInt();
        System.out.print("masukkan nilai 2: ");
        int b = input.nextInt();

        a += b;
        System.out.println("hasil perjumlahan: " + a);
        a -= b;
        System.out.println("hasil pengurangan: " + a);
        a *= b;
        System.out.println("hasil perkalian: " + a);
        a /= b;
        System.out.println("hasil pembagian: " + a);
        a %= b;
        System.out.println("hasil sisa bagi: " + a);
    }
}
