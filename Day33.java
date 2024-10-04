package pkg100haringoding;

public class Day33 {
    
    public static void main(String[] args) {
        //Type casting (proses mengubah tipe data dari satu tipe ke tipe data lainnya)
        //Ada beberapa cara untuk melakukan type casting

        int a = 100;                                //metode implisit casting(mengubah tipe data kecil ke tipe data besar)
        double typA = a;
        System.out.println("hasil: " + typA);

        double b = 30.5;                            //metode eksplisit casting(mengubah tipe data besar ke tipe data kecil)
        int typB = (int) b;
        System.out.println("hasil: " + typB);
    }
}
