package pkg100haringoding.Day39;
import java.util.Scanner;

public class soal1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("jumlah apel si penjaga kebun binatang: ");
        int apel = input.nextInt();
        System.out.print("jumlah monyet yang ingin di bagikan apel: ");
        int monyet = input.nextInt();

        apel %= monyet;

        System.out.println("jumlah apel yang tersisa setalah di bagikan: " + apel);


    }
}
