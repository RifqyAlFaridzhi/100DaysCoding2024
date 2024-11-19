package pkg100haringoding2;
import java.util.Arrays;
import java.util.Scanner;

public class Day79 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah : ");
        int a = input.nextInt();

        String[] Str1 = new String[a];
            for (int i = 0; i < a; i++) {
                System.out.print("nama orang: " + (i + 1) + ": ");
                Str1[i] = input.next();
            }
        
        System.out.println("daftar nama yang di masukkan: ");
        System.out.println(Arrays.toString(Str1));
    }
}
