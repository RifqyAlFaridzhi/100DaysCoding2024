package pkg100haringoding;
import java.util.Scanner;

public class Day51 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int hari = input.nextInt();
    
            switch (hari) {
                case 1:
                    System.out.println("Hari ke-1 adalah Senin.");
                    break;
                case 2:
                    System.out.println("Hari ke-2 adalah Selasa.");
                    break;
                case 3:
                    System.out.println("Hari ke-3 adalah Rabu.");
                    break;
                case 4:
                    System.out.println("Hari ke-4 adalah Kamis.");
                    break;
                case 5:
                    System.out.println("Hari ke-5 adalah Jumat.");
                    break;
                case 6:
                    System.out.println("Hari ke-6 adalah Sabtu.");
                    break;
                case 7:
                    System.out.println("Hari ke-7 adalah Minggu.");
                    break;
                default:
                    System.out.println("Input tidak valid.");
            }

    }
}
