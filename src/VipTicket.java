public class VipTicket  extends  Ticket{


   VipTicket(String event, String address, double price, double discount) {
      super(event, address, price, discount);
   }

   @Override
   public double calculatePrice() {
      return getPrice() * 0.1;
   }
}
