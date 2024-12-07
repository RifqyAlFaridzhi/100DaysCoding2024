package pkg100haringoding2;
import java.util.Scanner;

public class Day97 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int Var1 = input.nextInt();

            for (int i = 2; i <= Var1; i++) {
                boolean x = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        x = false;
                        break;
                    }
                }
                if (x) {
                    System.out.print(i + " ");
                }
            }
    }
}