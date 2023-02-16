package kr.ft.seoul.TicketSellingApplication.Bag;

import kr.ft.seoul.TicketSellingApplication.Invitation.Invitation;
import kr.ft.seoul.TicketSellingApplication.Ticket.Ticket;

public class Bag {
    private long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag() {
        this(null, 0);
    }

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return this.invitation != null;
    }

    public boolean hasTicket() {
        return this.ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }

    public void plusAmount(long amount) {
        this.amount += amount;
    }
}