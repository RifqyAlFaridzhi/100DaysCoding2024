package pkg100haringoding;

import java.util.Scanner;

public class Day58 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int a = input.nextInt();

        while (a > 0) {
            System.out.print(a + " ");
            a -= 7;
        }

    }
}
