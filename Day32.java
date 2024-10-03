package pkg100haringoding;

public class Day32 {
    
    public static void main(String[] args) {
        //Melakukan konversi tipe data primitif ke tipe data String
        //ada beberapa cara untuk melakukan konversi data primitif ke String

        //menggunakan Valueof
        int angka1 = 300;
        String Strangka = String.valueOf(angka1);
        System.out.println("hasil: " + Strangka);

        char karakter2 = 'b';
        String Strkarakter2 = String.valueOf(karakter2);
        System.out.println("hasil: " + Strkarakter2);


        //menggunakan toString(metode ini di gunakan sesuai tipe data primitif yang kita pakai)
        int angka2 = 300;
        String Strangka2 = Integer.toString(angka2);
        System.out.println("hasil: " + Strangka2);

        float nilaix = 89.67f;
        String Strnilaix = Float.toString(nilaix);
        System.out.println("hasil: " + Strnilaix);

        boolean benar = true;
        String Strbenar = Boolean.toString(benar);
        System.out.println("hasil " + Strbenar);

        
        //menggunakan penggabungan String(tanda kutip 2)
        int angka3 = 300;
        String Strangka3 = angka3 + "";
        System.out.println("hasil: " + Strangka3);

        char karakter1 = 'a' ;
        String Strkarakter1 = karakter1 + "";
        System.out.println("hasil: " + Strkarakter1);

        
        //menggunakan StringFormat
        int angka4 = 300;
        String Strangka4 = String.format("%d", angka4);
        System.out.println("hasil: " + Strangka4);
        
    }
}
