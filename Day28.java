package pkg100haringoding2;

public class Day28 {
    
    public static void main(String[] args) {
        Boolean nilaiA = true;
        Boolean nilaB = false;
        
        Boolean c = nilaiA != nilaB;
        Boolean d = nilaiA == nilaB;

        System.out.println("apakah a sama b itu sama sama huruf " + c);
        System.out.println("apakah a sama b itu sama sama angka "+ d);
    }
}
