package pkg100haringoding;

public class Day31 {
    
    public static void main(String[] args) {
        //Melakukan konversi tipe data String ke tipe data primitif
        //metode yang di pakai bernama parsing

        String A = "500"; //String ke long
        long lngA = Long.parseLong(A);
            
        System.out.println("hasil: " + lngA);

        String B = "68.56"; //String ke float
        float fltB = Float.parseFloat(B);

        System.out.println("hasil: " + fltB);

        String C = "true"; //String ke Boolean
        boolean bolnC = Boolean.parseBoolean(C);
        System.out.println("hasil: " + bolnC);
        
    }
}
