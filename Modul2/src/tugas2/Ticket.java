package tugas2;

public class Ticket {
    public String passengerName;
    public String startLocation;
    public String destination;
    public double price;

    public void displayInpfo() {
        final double TAX_RATE = 0.1;
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Start Location : " + startLocation);
        System.out.println("Destination : " + destination);
        System.out.println("Price : " + price);
        System.out.println("Final Price : " + (price + (price * 0.1))); // Price including 10% tax
    }
}
