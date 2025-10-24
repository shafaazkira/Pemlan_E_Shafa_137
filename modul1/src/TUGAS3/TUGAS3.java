package TUGAS3;

import java.util.Scanner;

public class TUGAS3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nilai akhir: ");
            int nilai = scanner.nextInt();
            String status;
            if (nilai >= 60) {
                status = "Lulus";}
            else {
                status = "Tidak Lulus";}
            System.out.println("Nama: " + nama);
            System.out.println("Status Kelulusan: " + status);
            scanner.close();
        }
    }
