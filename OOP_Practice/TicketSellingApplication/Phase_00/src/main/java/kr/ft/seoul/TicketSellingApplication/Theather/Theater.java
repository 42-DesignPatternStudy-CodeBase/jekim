package kr.ft.seoul.TicketSellingApplication.Theather;

import kr.ft.seoul.TicketSellingApplication.Audience.Audience;
import kr.ft.seoul.TicketSellingApplication.Ticket.Ticket;

public class Theater {
    private TicketSeller ticketSeller;
    
    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket();    
        } 
    }
}

