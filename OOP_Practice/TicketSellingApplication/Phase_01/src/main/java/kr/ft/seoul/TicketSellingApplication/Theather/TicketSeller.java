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

// 사실 여기서 sellTo 로직을 만들었다고 해서 구현된 로직이 특별하게 변경되는 것은 아니다.
// 단지 전체로직에서 객체의 책임을 나눈 후에, 그 책임이 머무는 객체에서 로직의 일부를 실행했고
// 로직 실행이 끝난 뒤, 로직을 넘겨받을 다음 객체가 주도적으로 처리하는 과정을 반복했을 뿐이다.
// 그러나 그 과정에서 객체의 책임을 분배하고, 자신이 명확하게 책임지는 로직을 실행하고 메세지를 간략화하면서,
// 기존 변경전의 Theater 처럼 모든 로직을 홀로 처리하는 독재자 클래스는 사라지고
// 그 자리에는 변경 가능하고 탄력적인 프로그램이 남는다.
// -> 책임의 이동 (shift of responsibility)