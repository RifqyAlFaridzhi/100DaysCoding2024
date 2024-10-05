package pkg100haringoding;
import java.util.Scanner;

public class Day34 {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int gaji;
            int jamLembur;
            
            System.out.print("Masukkan berapa gaji pokok: ");
            gaji = input.nextInt();
            System.out.print("Masukkan berapa jam lembur: ");
            jamLembur = input.nextInt();
            int LemburPerJam = 10000;

            int bonusLembur = jamLembur * LemburPerJam;
            System.out.println("Gaji bersih adalah: " + (gaji+bonusLembur) );
        }
    }
}
