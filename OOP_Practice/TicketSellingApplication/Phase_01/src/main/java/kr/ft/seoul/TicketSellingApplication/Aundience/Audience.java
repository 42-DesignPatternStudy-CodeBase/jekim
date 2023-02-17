package kr.ft.seoul.TicketSellingApplication.Audience;

import kr.ft.seoul.TicketSellingApplication.Bag.Bag;
import kr.ft.seoul.TicketSellingApplication.Ticket.Ticket;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    // public Bag getBag() {
    //     return bag;
    // }

    public long buy(Ticket ticket) {
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.minusAmount(ticket.getFee());
            bag.setTicket(ticket);
            return ticket.getFee();
        }
    }
}

//  sellTo 로직에서 가방과 티켓을 셋업하고 가격에 맞춰 돈을 내는 부분을 셋업했다.

//  이제 audience의 역할은 티켓 판매과정에서 주도적으로 가방을 확인하고 돈을 내는 자율적 존재로 변했다.
//  그 과정에서 여러 객체들에서 동작을 수행했던 Bag 클래스가 Audience 밑으로 계층관계를 명확히 하였으며,
//  audience와 ticketSeller, 더 나아가 Theater에 까지 확장에 있어서 열린 상태로 변화되었다.

// audience 객체가 자율적으로 buy로직에서 티켓 판매 로직의 일부를 처리하면서
// 외부 클래스에 자원을 내어주는 getBag 메소드의 필요가 더이상 없어졌다.
// ! : 무조건 게터와 세터를 만들어주는 것이 객체지향은 아니고, 외부로 전송할 메세지가 중요하군요.