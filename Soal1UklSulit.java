import java.util.Scanner;

public class Soal1UklSulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Siswa:");
        int jumlahSiswa = input.nextInt();

        double[] nilaiSiswa = new double[jumlahSiswa];
        double totalNilai = 0.0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan Nilai Siswa ke-" + (i + 1) + ":");
            nilaiSiswa[i] = input.nextDouble();
            totalNilai += nilaiSiswa[i];
        }
        double rataRata = totalNilai / (double) jumlahSiswa;
        System.out.println(("\n====HASIL REKAP NILAI SISWA===="));
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Nilai Siswa ke-" + (i + 1) + ": " + nilaiSiswa[i]);
        }

            //cetak rata-rata hanya sekali diahir
            System.out.println("Rata-rata Nilai Siswa: " + rataRata);

            input.close();
        }
    }

