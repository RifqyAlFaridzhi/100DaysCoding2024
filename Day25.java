package pkg100haringoding2;

public class Day25 {
    
    public static void main(String[] args) {
        /*variable tipe data double(tipe data ini digunakan untuk menyimpan nilai desimal dengan presisi ganda. 
           besaran Bytenya 8 byte Cukup untuk menampung 15 digit desimal)*/

        double angka1 = 8.9;
        double angka2 = 3.51;

         Double angkaA = Double.valueOf(angka1);
         Double angkaB = Double.valueOf(angka2);

        System.out.println("hasil: ");
        System.out.printf("\nTambah: %f", angkaA + angkaB);
        System.out.printf("\nkurang: %f", angkaA - angkaB);
    }
}
