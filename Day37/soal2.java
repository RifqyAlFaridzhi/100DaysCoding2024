package pkg100haringoding.Day37;
import java.util.Scanner;

public class soal2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah awal pohon si tukang kebun: ");
        int pohonAwal = input.nextInt();
        System.out.print("jumlah pohon yang di tambah setiap bulan: ");
        int pohonTmbh = input.nextInt();

        pohonAwal += pohonTmbh; 
        System.out.printf("jumlah pohon di kebun yang sudah di tambah: %s", pohonAwal);
    }
}
