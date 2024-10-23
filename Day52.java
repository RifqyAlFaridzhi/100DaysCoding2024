package pkg100haringoding;
import java.util.Scanner;

public class Day52 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai 1: ");
        int a = input.nextInt();

        System.out.print("masukkan nilai 1: ");
        int b = input.nextInt();

        String hasil = (a > b) ? "true" : "false";
        System.out.println("angka a lebih besar dari angka b " + hasil);
        
        String hasil1 = (a < b) ? "true" : "false";
        System.out.println("angka a lebih kecil dari angka b " + hasil1); 
    }
}
