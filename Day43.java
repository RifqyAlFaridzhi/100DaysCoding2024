package pkg100haringoding2;
import java.util.Scanner;

public class Day43 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai 1: ");
        int a = input.nextInt();
        System.out.print("masukkan nilai 2: ");
        int b = input.nextInt();

        boolean hasil1 = a >= b;
        boolean hasil2 = a <= b;

        System.out.println("nilai 1 lebih besar atau sama dengan nilai 2: " + hasil1);
        System.out.println("nilai 1 lebih kecil atau sama dengan nilai 2: " + hasil2);

    }
}
