package tugas2;

public class mainApp extends Ticket implements Operational {
    private static final double TAX_RATE = 0.1;
    private double duration;
    private double speed;

    private static final double MIN_SPEED = 5;
    private static final double MAX_SPEED = 100;

    public void taxiticket(String passengerName, String startLocation, String destination, double price, double duration, double speed) {
        this.passengerName = passengerName;
        this.startLocation = startLocation;
        this.destination = destination;
        this.price = price;
        this.duration = duration;
        this.speed = speed;
    }

    @Override
    public void checkStatus() {
        System.out.println("Your taxi is heading to " + destination);
    }

    @Override
    public void displayEstimatedDuration() {
        System.out.println("Estimated travel duration: " + duration + " minutes");
    }

    @Override
    public void displayRoute() {
        System.out.println("Route: " + startLocation + " -> " + destination);
    }

    public void slowDown(double speedReduction) {
        speed -= speedReduction;
        if (speed < MIN_SPEED)
            speed = MIN_SPEED;
        duration += speedReduction * 0.5;
        System.out.println("Taxi slowed down! Current speed: " + speed + " km/h");
    }

    public void speedUp(double speedIncrease) {
        speed += speedIncrease;
        if (speed > MAX_SPEED)
            speed = MAX_SPEED;
        System.out.println("Taxi sped up! Current speed: " + speed + " km/h");
    }

    private double calculateFinalPrice(){
        return price + (price * TAX_RATE);
    }

    public static void main(String[] args) {
        taxiticket ticket = new taxiticket("Alice", "Downtown", "Airport", 50.0, 30.0, 60.0);

        ticket.detailedInfo();

        ticket.cS();

        ticket.dR();
        ticket.dED();

        ticket.slowDown(20);
        ticket.speedUp(15);
    }
}
