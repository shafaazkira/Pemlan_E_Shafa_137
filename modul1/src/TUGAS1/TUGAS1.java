package TUGAS1; // Menentukan paket tempat file ini berada

import java.util.Scanner; // Mengimpor kelas Scanner untuk menerima input dari pengguna

public class TUGAS1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah angka yang akan diinput
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();

        // Membuat array untuk menyimpan angka-angka yang diinput pengguna
        int[] angka = new int[n];

        // Meminta pengguna memasukkan angka satu per satu
        System.out.println("Masukkan angka-angkanya:");
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt(); // Menyimpan angka ke dalam array
        }

        // Menghitung total dari semua angka
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i]; // Menambahkan setiap angka ke total
        }

        // Menghitung rata-rata dengan membagi total dengan jumlah angka
        double rataRata = (double) total / n;

        // Menampilkan hasil perhitungan
        System.out.println("\n=== Hasil Perhitungan ===");

        // Menampilkan kembali semua angka yang telah dimasukkan
        System.out.print("Angka yang dimasukkan: ");
        for (int i = 0; i < n; i++) {
            // Menampilkan angka dengan koma sebagai pemisah
            System.out.print(angka[i] + (i < n - 1 ? ", " : ""));
        }

        // Menampilkan total semua angka
        System.out.println("\nTotal: " + total);

        // Menampilkan rata-rata dengan 2 angka di belakang koma
        System.out.printf("Rata-rata adalah: %.2f\n", rataRata);

        // Menutup objek scanner untuk mencegah kebocoran memori
        scanner.close();
    }
}
