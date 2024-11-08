package pkg100haringoding2;

public class Day68 {
    
    public int perjumlahan(int a, int b) {
        return a+=b;
    }
    public int pengurangan(int c, int d) {
        return c+=d;
    }
    public int perkalian(int e, int f) {
        return e*=f;
    }
    public int pembagian(int g, int h) {
        return g/=h;
    }
    public static void main(String[] args) {
        Day68 Var0 = new Day68();
        int hasil1 = Var0.perjumlahan(30, 20);
        System.out.println("hasil perjumlahan "  + hasil1);
        int hasil2 = Var0.pengurangan(30, 10);
        System.out.println("hasil pengurangan: " + hasil2);
        int hasil3 = Var0.perkalian(30, 20);
        System.out.println("hasil perkalian: " + hasil3);
        int hasil4 = Var0.pembagian(48, 8);
        System.out.println("hasil pembagian: " + hasil4);
    }
}
