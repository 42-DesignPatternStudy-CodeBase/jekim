package kr.ft.seoul.StatePattern.Player.PlayerLevel;

import kr.ft.seoul.StatePattern.Player.Player;

public class SuperbLevel implements PlayerLevel {
    private Player player;
    
    public SuperbLevel(Player player) {
        this.player = player;
    }

    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }

    public void nextLevel() {
        ;
    }
}