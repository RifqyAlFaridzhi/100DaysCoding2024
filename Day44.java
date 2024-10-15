package pkg100haringoding2;
import java.util.Scanner;

public class Day44 {
    
    public static void main(String[] args) {
        //Operator logika AND
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int a = input.nextInt();

        if (a > 60 && a < 100) {
            System.out.println("Status: Lulus");
        } 
        else {
            System.out.println("Status: Tidak Lulus");
        }
    }   
}
