package codelab1;

public class codelab1 {
    public static void main(String[] args) {
        String[ ] daftarNama = {"Shafa", "Aditya", "Rahman", "Azkirasa", "Samudera"};
        String namaTerpajang = cariNamaTerpanjang(daftarNama);
        System.out.println("Nama terpanjang adalah: " + namaTerpajang);
    }

    private static String cariNamaTerpanjang(String[] data) {
        String hasil = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i].length() > hasil.length()) {
                hasil = data[i];
            }
        }
        return hasil;
    }
}
