package kr.ft.seoul.StatePattern.Game.GameBehavior;

import kr.ft.seoul.StatePattern.Player.Player;

public class RunBehavior implements GameBehavior {
    private String keyword = "Run";

    public void doBehavior(Player player) {
        player.run();
    }

    public String getKeyword() {
        return this.keyword;
    }
}