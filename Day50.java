package pkg100haringoding2;
import java.util.Scanner;

public class Day50 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan kalimat terpilih: ");
        String a = input.nextLine();

            if (a.equalsIgnoreCase("Ari123")) {
                System.out.println("kalimat utama");
            }
            else if (a.equalsIgnoreCase("Admin123")) {
                System.out.println("kalimat opsional");
            }
            else {
                System.out.println("Error");
            }
    }
}
