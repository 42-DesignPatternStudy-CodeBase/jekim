package kr.ft.seoul.StatePattern.Game.GameBehavior;

import kr.ft.seoul.StatePattern.Player.Player;

public class JumpBehavior implements GameBehavior {
    private String keyword = "Jump";

    public void doBehavior(Player player) {
        player.jump();
    }

    public String getKeyword() {
        return this.keyword;
    }
}