package pkg100haringoding.Day36;
import java.util.Scanner;

public class soalPembagian {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Jumlah permen yang di miliki guru: ");
       int permen = input.nextInt();
       System.out.print("Jumlah murid: ");
       int jumlahMurid = input.nextInt();
       
       int hasil = permen / jumlahMurid;
       System.out.printf("jumlah permen yang di terima oleh setiap siswa: %d ", hasil);
    }
}
