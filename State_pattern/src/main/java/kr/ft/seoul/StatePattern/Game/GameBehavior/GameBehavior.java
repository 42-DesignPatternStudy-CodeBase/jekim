package kr.ft.seoul.StatePattern.Game.GameBehavior;

import kr.ft.seoul.StatePattern.Player.Player;

public interface GameBehavior {
    public String getKeyword();
    public void doBehavior(Player player);
}