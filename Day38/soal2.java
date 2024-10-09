package pkg100haringoding.Day38;
import java.util.Scanner;

public class soal2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("jumlah stok beras yang di miliki pemilik warung: ");
        int beras = input.nextInt();
        System.out.print("jumlah stok beras ingin di jual: ");
        int JualBeras = input.nextInt();

        beras /= JualBeras;
        System.out.printf("sisa stok beras setiap bagian setelah di jual: %s", beras);
    }
}
