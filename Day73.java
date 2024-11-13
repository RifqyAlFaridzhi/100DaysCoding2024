package pkg100haringoding2;
import java.util.Scanner;

public class Day73 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nama: ");
        String a = input.nextLine();
        System.out.print("masukkann istilah nama: ");
        char b = input.next().charAt(0);

        System.out.println("istilah dari " + a + " adalah " + b);
    }
}
