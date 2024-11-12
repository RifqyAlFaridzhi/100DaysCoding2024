package pkg100haringoding2;
import java.util.Scanner;

public class Day72 {
    
    public static int faktorial(int n) {         //method rekursif(mencari faktorial dari sebuah bilangan bulat)
        if (n == 0) {
            return 1;
        } 
        else {
            return n * faktorial(n - 1);
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Var1 = input.nextInt();
        System.out.println("Faktorial dari " + Var1 + " adalah: " + faktorial(Var1));
    }
}

