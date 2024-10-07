package pkg100haringoding.Day36;
import java.util.Scanner;

public class soalModulo {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Jumlah apel ali yang dimiliki: ");
       int apel = input.nextInt();
       System.out.print("Jumlah teman ali: ");
       int jumlahTemanAli = input.nextInt();
       
       int hasil = apel % jumlahTemanAli;
       System.out.printf("Sisa apel yang tidak bisa di bagi oleh ali: %d ", hasil);
    }
}
