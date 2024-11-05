package pkg100haringoding2;
import java.util.Scanner;

public class Day65 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int Var1 = input.nextInt();
        System.out.println("=============================================================");
        for (int i = 1; i <= Var1; i++) {               //nested loop(perulangan bersarang)
            for (int j = 1; j <= Var1; j++) {
                System.out.print(i + " X " + j + " = " + (i*j) + "\t");
            }
            System.out.println("");
        }
    }
}
