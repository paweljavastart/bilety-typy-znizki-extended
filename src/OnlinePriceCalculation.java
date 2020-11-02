public class OnlinePriceCalculation {
   public static double onlinePrice(Ticket ticket) {
      double price = ticket.getPrice();
      double discount = ticket.getDiscount();
      return price - (price * discount);
   }

}
