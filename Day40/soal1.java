package pkg100haringoding.Day40;
import java.util.Scanner;

public class soal1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai ujian pertama: ");
        int nilaiA = input.nextInt();
        System.out.print("nilai ujian kedua: ");
        int nilaiB = input.nextInt();

        nilaiA -= nilaiB;
        System.out.println("jadi selisih di antara nilai ujian pertama dan nilai ujian kedua ialah: " + nilaiA);
    }
}
