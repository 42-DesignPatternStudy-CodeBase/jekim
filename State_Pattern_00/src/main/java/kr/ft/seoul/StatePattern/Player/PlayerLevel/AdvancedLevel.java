package kr.ft.seoul.StatePattern.Player.PlayerLevel;

import kr.ft.seoul.StatePattern.Player.Player;

public class AdvancedLevel implements PlayerLevel {
    private Player player;
    
    public AdvancedLevel(Player player) {
        this.player = player;
    }

    public void jump() {
        System.out.println("높이 jump 합니다.");
        this.nextLevel();
    }

    public void run() {
        System.out.println("빨리 달립니다.");
        this.nextLevel();
    }

    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
        this.nextLevel();
    }

    public void nextLevel() {
        this.player.setLevel(this.player.getSuperbLevel());
    }
}