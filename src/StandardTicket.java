public class StandardTicket extends OnlineTicket {
   private static final double STANDARD_TICKET_CHARGE = 5;


   StandardTicket(String event, String address, double price, double discount) {
      super(event, address, price, discount);
   }

   public double calculatePrice() {
      return super.calculatePrice() + STANDARD_TICKET_CHARGE;
   }


}
