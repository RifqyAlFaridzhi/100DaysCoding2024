package pkg100haringoding2;
import java.math.BigDecimal;

public class Day30 {
    
    public static void main(String[] args) {
        //BigInteger digunakan untuk perhitungan matematis untuk bilangan decimal yang sangat besar
        
        BigDecimal angka1 = new BigDecimal("135.344");
        BigDecimal angka2 = new BigDecimal("124.456");

        BigDecimal hasilJumlah = angka1.add(angka2);                        //perjumlahan
        System.out.println("hasil perjumlahannya: " + hasilJumlah);

        BigDecimal hasilperkalian = angka1.multiply(angka2);                //perkalian
        System.out.println("hasil perkaliannya: " + hasilperkalian);

        BigDecimal hasilpengurangan = angka1.subtract(angka2);              //pengurangan
        System.out.println("pasil pengurangannya: " + hasilpengurangan);
    }
}
