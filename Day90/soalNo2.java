package pkg100haringoding2.Day90;
import java.util.Scanner;

public class soalNo2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;                                               
        for (;;) {
            int b = input.nextInt();
            if (b == 0) {
                break;
            }
            else if (b < 0) {
                b = -b;
            }
            a = (a + b);
        }
        System.out.println(a);
    }
}
