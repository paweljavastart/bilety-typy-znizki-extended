class TicketApp {
    public static void main(String[] args) {
//        Ticket ticket1 = new Ticket("Koncert Metallica", "Wrocław, Hala Stulecia", Ticket.TYPE_GIFT, 300, 0.1);
//        Ticket ticket2 = new Ticket("Koncert Metallica", "Wrocław, Hala Stulecia", Ticket.TYPE_ONLINE, 200, 0.1);
//        Ticket ticket3 = new Ticket("Pokaz sztucznych ogni", "Szczecin", Ticket.TYPE_STANDARD, 50, 0);
//
//        System.out.println(ticket1.getId());
//        System.out.println(ticket2.getId());
//        System.out.println(ticket3.getId());

        Ticket ticket1 = new GiftTicket("event 1", "address 1", 100, 10);
        Ticket ticket2 = new OnlineTicket("event 2", "address 2", 50, 23);
        Ticket ticket3 = new StandardTicket("event 2", "address 2", 50, 23);
        Ticket ticket4 = new VipTicket("event 2", "address 2", 50, 23);


        double finalPrice1 = TicketPriceCalculator.calculateFinalPrice(ticket1);
        System.out.println(ticket1.getDescription() + ", ostateczna cena: " + finalPrice1);
        double finalPrice2 = TicketPriceCalculator.calculateFinalPrice(ticket2);
        System.out.println(ticket2.getDescription() + ", ostateczna cena: " + finalPrice2);
        double finalPrice3 = TicketPriceCalculator.calculateFinalPrice(ticket3);
        System.out.println(ticket3.getDescription() + ", ostateczna cena: " + finalPrice3);
        double finalPrice4 = TicketPriceCalculator.calculateFinalPrice(ticket4);
        System.out.println(ticket3.getDescription() + ", ostateczna cena: " + finalPrice4);
    }
}
