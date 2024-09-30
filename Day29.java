package pkg100haringoding2;
import java.math.BigInteger;

public class Day29 {
    public static void main(String[] args) {
        //BigInteger digunakan untuk perhitungan matematis untuk bilangan yang sangat besar.
        
        BigInteger angka1 = new BigInteger("8328438174673169847");
        BigInteger angka2 = new BigInteger("15645151486545155622");

        BigInteger hasilJumlah = angka1.add(angka2);                        //perjumlahan
        System.out.println("hasil perjumlahannya: " + hasilJumlah);

        BigInteger hasilperkalian = angka1.multiply(angka2);                //perkalian
        System.out.println("hasil perkaliannya: " + hasilperkalian);

        BigInteger hasilpembagian = angka1.divide(angka2);                  //pembagian
        System.out.println("hasil pembagiannya: " + hasilpembagian);

        BigInteger hasilpengurangan = angka1.subtract(angka2);              //pengurangan
        System.out.println("pasil pengurangannya" + hasilpengurangan);


        
        
    }
}
