package pkg100haringoding.Day36;
import java.util.Scanner;

public class soalPerkalian {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah kebun si petani: ");
        int jumlahKebun = input.nextInt();

        int jumlahSemuaBuahDidapat = 50 * jumlahKebun;

        System.out.printf("Jumlah buah yang di dapatkan di semua kebun adalah %d kg", jumlahSemuaBuahDidapat);
    }
}
