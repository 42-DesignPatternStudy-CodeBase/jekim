package kr.ft.seoul.TicketSellingApplication.Theather;

import java.util.ArrayList;
import java.util.Arrays;

import kr.ft.seoul.TicketSellingApplication.Ticket.Ticket;

public class TicketOffice {
    private long amount;
    private ArrayList<Ticket> tickets;
    
    public TicketOffice(long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return this.tickets.remove(0);
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }

    public void plusAmount(long amount) {
        this.amount += amount;
    }
}