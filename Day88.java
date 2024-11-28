package pkg100haringoding2;
import java.util.Arrays;

public class Day88 {
    
    public static void main(String[] args) {
        int[] nilaiSiswa = {80, 70, 55, 45, 90, 97, 93, 85, 73, 60};
        
        int jumlah = 0;
        for (int i : nilaiSiswa) {
            jumlah += i;
        }
        double nilaiRatarata = jumlah / nilaiSiswa.length;

        int nilaiTinggi = nilaiSiswa[0];
        int nilaiRendah = nilaiSiswa[0];
        for (int i = 0; i < nilaiSiswa.length; i++) {
            if (nilaiSiswa[i] > nilaiTinggi) {
                nilaiTinggi = nilaiSiswa[i];
            }
            else if (nilaiSiswa[i] < nilaiRendah) {
                nilaiRendah = nilaiSiswa[i];
            }
        }

        int jumlahAtasRata2 = 0;
        for (int i = 0; i < nilaiSiswa.length; i++) {
            if (nilaiSiswa[i] > jumlahAtasRata2) {
                jumlahAtasRata2++;
            }
        }
        System.out.print("nilai siswa: " + Arrays.toString(nilaiSiswa));
        System.out.print("\nnilai rata rata seluruh siswa: " + nilaiRatarata);
        System.out.print("\nilai tertinggi siswa adalah: " + nilaiTinggi);
        System.out.print("\nnilai terendah siswa adalah: " + nilaiRendah);
        System.out.print("\njumlah siswa yang nilainya di atas rata rata adalah: " + jumlahAtasRata2);
    }
}
