package pkg100haringoding2;
import java.util.Scanner;

public class Day42 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai 1: ");
        int a = input.nextInt();
        System.out.print("masukkann nilai 1: ");
        int b = input.nextInt();

        boolean hasil1 = a==b;
        boolean hasil2 = a!=b;

        System.out.println("apakah angka 1 sama angka2 memiliki nilai sama: " + hasil1);
        System.out.println("apakah angka 1 sama angka 2 memiliki nilai yang berbeda: " + hasil2);
    }
}
