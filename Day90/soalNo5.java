package pkg100haringoding2.Day90;

import java.util.Scanner;

public class soalNo5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a < 1) {
            System.out.println("Invalid input");
        }
        else {
            while (a >= 1) {
                System.out.print(a + " ");
                if (a % 2 == 0) {
                    a -= 2;
                }
                else {
                    a -= 1;
                }
            }
        }
        System.out.println("1");
    }
}
