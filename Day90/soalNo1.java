package pkg100haringoding2.Day90;
import java.util.Scanner;

public class soalNo1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
