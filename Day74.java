package pkg100haringoding2;
import java.util.Scanner;

public class Day74 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan kalimat: ");
        String Str1 = input.nextLine();
        int kalimatStr = Str1.length();
            if (kalimatStr > 15) {
                System.out.println("kalimat memiliki lebih dari 15 karakter yaitu: " + kalimatStr + " karakter");
            }
            else if (kalimatStr == 15) {
                System.out.println("kalimat memiliki tepat 15 karakter");
            }
            else {
                System.out.println("karakter memiliki kurang dari 15 karakter yaitu: " + kalimatStr + " karakter");
            }
    }
}
