package pkg100haringoding;
import java.util.Scanner;

public class Day54 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int Var0 = input.nextInt();

            for (int i = 30; i >= Var0; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
    }
}
