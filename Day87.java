package pkg100haringoding2;

public class Day87 {
    
    public static void main(String[] args) {
        int[] Var1 = {1, 2, 3, 4, 5};
        System.out.print("sebelum merubah: ");
        for (int i = 0; i < Var1.length; i++) {
            System.out.print(Var1[i] + " ");
        }

        Var1[3] = 15;
        System.out.print("\nsetelah merubah: ");
        for (int i = 0; i < Var1.length; i++) {
            System.out.print(Var1[i] + " ");
        }
    }
}
