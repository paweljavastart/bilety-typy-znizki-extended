public class GiftTicket extends StandardTicket {

   private static final double STANDARD_TICKET_CHARGE = 5;

   private static final double GIFT_TICKET_CHARGE = 0.05;

   GiftTicket(String event, String address, double price, double discount) {
      super(event, address, price, discount);
   }

   public double calculatePrice() {
      double originalPrice = getPrice();
      double giftPayment = GIFT_TICKET_CHARGE * originalPrice;
      return this.calculatePrice() + giftPayment;
   }



   @Override
   String getDescription() {
      return "git ticket : " + super.getDescription();
   }
}
