package pkg100haringoding2;
import java.util.Scanner;

public class Day89 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan kalimat: ");
        String a = input.nextLine();
        
        String hasil = hurufKapital(a);
        System.out.print("hasil: " + hasil);

    }
    
    public static String hurufKapital(String a) {
        StringBuilder hasil = new StringBuilder();
        String[] kata = a.split(" ");
    
            for (String Char : kata) {
                if (Char.length() > 0) {
                    hasil.append(Character.toUpperCase(Char.charAt(0)));
                    if (Char.length() > 1) {
                        hasil.append(Char.substring(1).toLowerCase());
                    }
                    hasil.append(" ");
                }
            }
            return hasil.toString(). trim();
    } 
}