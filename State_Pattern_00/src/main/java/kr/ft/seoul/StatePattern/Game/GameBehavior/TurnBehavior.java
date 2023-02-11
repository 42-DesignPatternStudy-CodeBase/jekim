package kr.ft.seoul.StatePattern.Game.GameBehavior;

import kr.ft.seoul.StatePattern.Player.Player;

public class TurnBehavior implements GameBehavior {
    private String keyword = "Turn";

    public void doBehavior(Player player) {
        player.turn();
    }

    public String getKeyword() {
        return this.keyword;
    }
}