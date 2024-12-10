package pkg100haringoding2;
import java.util.Scanner;
import java.time.LocalTime;

public class Day100 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nama anda: ");
        String nama = input.nextLine();

            String x;
            LocalTime inpTime = LocalTime.now();
            if (inpTime.isBefore(LocalTime.NOON)) {
                x = "Selamat pagi";
            }
            else if (inpTime.isBefore(LocalTime.of(17, 0))) {
                x = "Selamat siang";
            }
            else {
                x = "Selamat malam";
            }
            
        System.out.println("=============================================");
        System.out.println("\t" + " " + nama + " " + x);
        System.out.println("\t" + "Program Anda Telah Selesai");
        System.out.println("=============================================");
    }
}
