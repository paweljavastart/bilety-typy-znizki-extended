public class OnlineTicket extends  Ticket {
   OnlineTicket(String event, String address, double price, double discount) {
      super(event, address, price, discount);
   }


   public double calculatePrice() {
      double price = getPrice();
      double discount = getDiscount();
      return price - (price * discount);
   }
}
