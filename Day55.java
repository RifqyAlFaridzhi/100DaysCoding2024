package pkg100haringoding;
import java.util.Scanner;

public class Day55 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai: ");
        int Var0 = input.nextInt();
        
            for (int i = 50; i > Var0; i--) {
                System.out.println("perulangan mundur " + i);
        }
    }
}
