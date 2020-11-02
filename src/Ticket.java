abstract class Ticket {

    private int id;
    private static int ticketCounter;
    private String event;
    private String address;
    private double price;
    private double discount;



    Ticket(String event, String address, double price, double discount) {
        ticketCounter++;
        id = ticketCounter;
        this.event = event;
        this.address = address;
        this.price = price;
        this.discount = discount;
    }
    public abstract double calculatePrice();

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }


    String getDescription() {
        return id + ", " + event +
                ", " + address +
                ", cena: " + price +
                "zł, zniżka: " + (discount * 100);
    }


}
