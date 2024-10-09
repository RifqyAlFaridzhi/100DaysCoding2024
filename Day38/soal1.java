package pkg100haringoding.Day38;
import java.util.Scanner;

public class soal1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("jumlah awal luas lahan berapa hektar yang di tanami padi: ");
        int lahan = input.nextInt();
        lahan *= 2;

        System.out.printf("jumlah luas lahan setelah satu tahun di gandakan: %d hektar" , lahan);


    }
}
