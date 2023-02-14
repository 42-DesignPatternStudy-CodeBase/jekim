package kr.ft.seoul.TicketSellingApplication.Audience;

import kr.ft.seoul.TicketSellingApplication.Bag.Bag;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}   