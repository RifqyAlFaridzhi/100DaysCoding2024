package pkg100haringoding;
import java.util.Scanner;

public class Day57 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int a = input.nextInt();

            while (a <= 50) {
                System.out.println(a + " ");
                a+=2;
            }
    }
}
