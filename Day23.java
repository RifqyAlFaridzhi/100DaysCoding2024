package pkg100haringoding;

public class Day23 {
    
    public static void main(String[] args) {
        /*variable data (tipe data ini digunakan untuk menyimpan nilai bilangan bulat yang sangat besar.
          besaran bytenya 8byte yang dimana Longb yang paling tinggi di antara lainnya) */
          Long a, b, c, d, e;
          a = 5780L;
          b = 8909L;
          b = b + 45;
          c = a + b;
          d = c + c * a;
          e = (c + d) * a;
          
          System.out.println("isi angka a= " +a);
          System.out.println("isi angka b=" +b);
          System.out.println("isi angka c=" +c);
          System.out.println("isi angka d=" +d);
          System.out.println("isi angka e="+e);
    

        
    }
}
