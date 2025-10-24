package tugas3sebelum;

public class shipticket {
    public String name;
    public String destination;
    public double price;

    public shipticket(String n, String d, double p) {
        name = n;
        destination = d;
        price = p;
    }

    public void showInfo() {
        double total = price + (price * 0.05);
        System.out.println("Nama Penumpang: " + name);
        System.out.println("Tujuan: " + destination);
        System.out.println("Harga Tiket + Pajak: " + total);
    }

    public static void main(String[] args) {
        shipticket t = new shipticket("Andi", "Bali", 300000);
        t.showInfo();
    }
}

