package pkg100haringoding2.Day90;

import java.util.Scanner;

public class soalNo4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        int b = Integer.MAX_VALUE;
        for (int i = 1; i <= a; i++) {
            int c = input.nextInt();
            if (c < b) {
                b = c;
            }
        }
        System.out.println(b);
    }
}
