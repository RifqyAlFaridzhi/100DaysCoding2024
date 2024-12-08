package pkg100haringoding2;
import java.util.Scanner;

public class Day98 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka awalan: ");
        int Var1 = input.nextInt();
        System.out.print("masukkan batas angka: ");
        int Var2 = input.nextInt();

        int jumlah = 0;
        for (int i = Var1; i <= Var2; i++) {
            if (i % 2 == 0) {
                jumlah += i;
                System.out.print(i);
                if (i != Var2) {
                    System.out.print(" + ");
                }
                else {
                    System.out.print(" = " + jumlah);
                }
            }
        }
        System.out.println();
    }
}