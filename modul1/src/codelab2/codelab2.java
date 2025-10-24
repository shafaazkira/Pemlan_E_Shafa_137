package codelab2;

import java.util.Scanner;

public class codelab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan usia anda: ");
            int usia = scanner.nextInt();
            if (usia <= 0 || usia >= 120) {
                throw new InvalidAgeException("Usia tidak valid! Usia harus antara 1 dan 119.");
            }
            System.out.println("Usia anda valid: " + usia + " tahun.");
        }
        catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        }
        scanner.close();
     }
}
