package pkg100haringoding;

public class Day59 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        System.out.println("nilai array!");
        for (int i: a){
            System.out.print(i+ " ");
        }

        System.out.println();
        
        int [] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13, 14, 15, 16, 17, 18, 19 ,20}; 
        System.out.println("nilai array yang naik 2!: ");
        for (int i : b) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
