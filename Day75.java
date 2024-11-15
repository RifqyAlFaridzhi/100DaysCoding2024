package pkg100haringoding2;
import java.util.Scanner;

public class Day75 {
    
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String input = scanner.nextLine();

        String kalimat = input.toLowerCase();
        System.out.println("akan menjadi: " + kalimat);
    }
}
