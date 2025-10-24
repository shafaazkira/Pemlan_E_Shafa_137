package TUGAS2;

import java.util.Scanner;

public class TUGAS2 {
    public static class NumberValidation {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Masukkan angka positif: ");
                int angka = scanner.nextInt();
                if (angka <= 0) {
                    throw new InvalidNumberException("Error: Angka harus positif!");
                }
                System.out.println("Angka valid: " + angka);
            } catch (InvalidNumberException e) {
                System.out.println("Error: Angka harus positif!");
            } catch (Exception e) {
                System.out.println("Input tidak valid, harus berupa angka.");
            }
        }
    }
}
