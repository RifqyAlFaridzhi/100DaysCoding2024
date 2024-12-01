package pkg100haringoding2;
import java.util.Scanner;

public class Day91 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("masukkan angka: ");
            int a = input.nextInt();
            if (a % 2 == 0) {
                System.out.println("genap");
            }
            else {
                System.out.println("You and I, end");
                break;
            }
        } while (true);
    }
}
