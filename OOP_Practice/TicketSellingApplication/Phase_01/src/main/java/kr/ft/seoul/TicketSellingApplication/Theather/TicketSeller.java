package kr.ft.seoul.TicketSellingApplication.Theather;

import kr.ft.seoul.TicketSellingApplication.Audience.Audience;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        this.ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}

// sellTo 메소드를 만들고, Theater에서 처리하던 enter로직을 들고 왔다.
// Theater 클래스는 sellTo 로직을 간편하게 실행시키고
// TicketSeller는 티켓을 판매하는 로직의 책임을 맡는다.
// 이제 TicketSeller는 티켓을 판매하는 과정에서 Theater의 통제를 받는 수동적 존재가 아니라
// 과정에서 자신이 로직의 일부의 책임을 맡고 수행하는 자율적인 객체가 되었다.

// "객체지향에서 자율적인 객체가 된다는 것은 무엇을 의미하는가?"