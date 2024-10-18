package pkg100haringoding2;
import java.util.Scanner;

public class Day45 {
    
    public static void main(String[] args) {
        //operator logika OR
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai1: ");
        int a = input.nextInt();
        System.out.print("masukkan nilai2: ");
        int b = input.nextInt();

        boolean hasil = a == b || a != b;
        System.out.println("hasil adalah: " + hasil);
    }   
}
