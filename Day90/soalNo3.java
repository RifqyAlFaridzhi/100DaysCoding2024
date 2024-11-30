package pkg100haringoding2.Day90;
import java.util.Scanner;

public class soalNo3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int rataRata = (a + b + c) / 3;
        if (rataRata > 90 && rataRata <= 100) {
            System.out.println("A");
        }
        else if (rataRata > 75 && rataRata <= 90) {
            System.out.println("B");
        }
        else if (rataRata > 60 && rataRata <= 75) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}
