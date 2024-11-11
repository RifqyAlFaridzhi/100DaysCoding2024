package pkg100haringoding2;
import java.util.Scanner;

public class Day71 {
    
    public static void Persegi(int Persegi) {
        for (int i = 0; i <= Persegi; i++) {
            for (int j = 0; j <= Persegi; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void MYname(String[] args) {
        System.out.println("Rifqy al faridzhi");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah bintang: ");
        int Persegi = input.nextInt();
        Persegi(Persegi);
        MYname(args);
    }
}

