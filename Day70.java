package pkg100haringoding2;
import java.util.Scanner;

public class Day70 {
    
    void PerulanganGenap(int a) {
        for (int i = 2; i <= a; i++) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        Day70 input = new Day70();
        input.PerulanganGenap(20);
    }
}
