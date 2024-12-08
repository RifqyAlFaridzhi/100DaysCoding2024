package pkg100haringoding2;
import java.util.Scanner;

public class Day98 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka awalan: ");
        int Var1 = input.nextInt();
        System.out.print("masukkan batas angka: ");
        int Var2 = input.nextInt();

        int jumlah = 0;
        for (int i = Var1; i <= Var2; i++) {
            if (i % 2 == 0) {
                jumlah += i;
                System.out.print(i);
                if (i != Var2) {
                    System.out.print(" + ");
                }
                else {
                    System.out.print(" = " + jumlah);
                }
            }
        }
        System.out.println();
    }
}

// import java.util.Scanner;

// public class SumEvenNumbers {
//     public static void main(String[] args) {
//         // Scanner untuk input dari pengguna
//         Scanner scanner = new Scanner(System.in);
        
//         // Meminta input nilai x dan y
//         System.out.print("Masukkan nilai x: ");
//         int x = scanner.nextInt();
        
//         System.out.print("Masukkan nilai y: ");
//         int y = scanner.nextInt();
        
//         // Variabel untuk menyimpan total penjumlahan bilangan genap
//         int total = 0;
        
//         // Loop dari x hingga y untuk mengecek bilangan genap
//         for (int i = x; i <= y; i++) {
//             // Jika bilangan genap, tambahkan ke total
//             if (i % 2 == 0) {
//                 total += i;
//             }
//         }
        
//         // Menampilkan hasil penjumlahan
//         System.out.println("Total penjumlahan bilangan genap dari " + x + " hingga " + y + " adalah: " + total);
//     }
// }

