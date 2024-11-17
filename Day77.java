package pkg100haringoding2;
import java.util.Scanner;

public class Day77 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (;;) {
            System.out.print("masukkan password yang tepat: ");
            String Str1 = input.nextLine();
            if (Str1.equals("adminbaikhati123")) {
                for (int i = 1; i <= 2; i++) {
                    System.out.println("SUCCSESFUL");
                }
                break;
            }
            else {
                System.out.println("FAILED");
            }
        }
    }
}
