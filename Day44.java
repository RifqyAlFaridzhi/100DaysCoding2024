package pkg100haringoding2;
import java.util.Scanner;

public class Day44 {
    
    public static void main(String[] args) {
        //Operator logika AND
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int a = input.nextInt();

        boolean hasil = a > 0 && a < 10;
        System.out.println("hasilnya adalah: " + hasil);
        
        }
    }   
}
