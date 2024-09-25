package pkg100haringoding;

public class Day24 {
    
    public static void main(String[] args) {
        /*variable data float(tipe data ini digunakan untuk menyimpan nilai desimal dengan presisi tunggal
           besaran bytenya 4byte Menampung nilai numerik pecahan. Cukup untuk menampung 6 sampai 7 digit desimal)*/
           
        Float angka1, angka2, angka3;
        angka1 = 45.78f;
        angka2 = 50.67f;
        angka3 = Float.valueOf(angka2);
        
        Float hasil = angka1 * angka2 *angka3;
        System.out.println("hasil perkalian sama dengan: "+hasil);

    }
}

