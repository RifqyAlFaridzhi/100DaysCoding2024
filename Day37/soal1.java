package pkg100haringoding.Day37;
import java.util.Scanner;

public class soal1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("jumlah pensil yang ingin di beli siswa: ");
        int pensil = input.nextInt();

        System.out.println("jumlah pensil siswa yang awalnya 0, setelah membeli " + pensil + 
                            " pensil maka jumlah pensilnya sekarang adalah " + pensil);
    }
}
