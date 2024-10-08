package pkg100haringoding.Day37;
import java.util.Scanner;

public class soal3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("jumlah barang yang ada di gudang toko: ");
        int barang1 = input.nextInt();
        System.out.print("jumlah barang yang di jual setiap minggu: ");
        int barang2 = input.nextInt();

        int hasil = barang1 - barang2;
        System.out.println("sisa barang yang ada di gudang setelah satu minggu penjualan: " + hasil);
    }
}
