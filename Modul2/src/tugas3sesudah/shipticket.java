package tugas3sesudah;

public class shipticket implements ticketinfodisplay {
    private String passengerName;
    private String destination;
    private double price;

    public static final double TAX_RATE = 0.05;

    public shipticket(String passengerName, String destination, double price) {
        this.passengerName = passengerName;
        this.destination = destination;
        this.price = price;
    }

    public String getPassengerName() { return passengerName; }
    public String getDestination() { return destination; }
    public double getPrice() { return price; }

    public double calculateTotalPrice() {
        return price + (price * TAX_RATE);
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama Penumpang: " + getPassengerName());
        System.out.println("Tujuan: " + getDestination());
        System.out.println("Harga Tiket + Pajak: " + calculateTotalPrice());
    }
}

