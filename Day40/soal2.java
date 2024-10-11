package pkg100haringoding.Day40;
import java.util.Scanner;

public class soal2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("jumlah stok barang pertama: ");
        int stok1 = input.nextInt();
        System.out.print("jumlah stok barang kedua: ");
        int stok2 = input.nextInt();

        stok1 -= stok2;
        System.out.println("selisih di antara stok barang pertama dan stok barang kedua ialah " + stok1);
    }
}
