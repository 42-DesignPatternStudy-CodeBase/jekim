package kr.ft.seoul.TicketSellingApplication.Theather;

import kr.ft.seoul.TicketSellingApplication.Audience.Audience;

public class Theater {
    private TicketSeller ticketSeller;
    
    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        this.ticketSeller.sellTo(audience);
    }
}

// Theater가 selling을 하는 주체인가?
//  주체의 위임이 가능한가?
//  가능하다면, 자율적일 수 있는 객체들을 자율적으로 만들어 준 후
//  그들의 결합도를 떨어트려 주는 것이 맞다.