package pkg100haringoding2;
import java.util.Scanner;

public class Day75 {
    
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String input = scanner.nextLine();

        String kalimat = input.toLowerCase();

        if (kalimat.startsWith("a")) {
            System.out.println("Kata dimulai dengan huruf 'a'.");
        }
        else if (kalimat.startsWith("b")) {
            System.out.println("Kata dimulai dengan huruf 'b'.");
        }
        else {
            System.out.println("Kata tidak dimulai dengan huruf 'a' atau 'b'.");
        }
    }
}
