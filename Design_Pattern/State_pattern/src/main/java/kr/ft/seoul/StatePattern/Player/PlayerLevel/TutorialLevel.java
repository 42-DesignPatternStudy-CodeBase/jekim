package kr.ft.seoul.StatePattern.Player.PlayerLevel;

import kr.ft.seoul.StatePattern.Player.Player;

public class TutorialLevel implements PlayerLevel {
    private Player player;

    public TutorialLevel(Player player) {
        this.player = player;
    }

    public void jump() {
        System.out.println("도움을 받아 점프를 했어요.");
        this.nextLevel();
    }

    public void run() {
        System.out.println("도움을 받아서 걸었어요.");
        this.nextLevel();
    }

    public void turn() {
        System.out.println("아직 할 줄 몰라요.");
        this.nextLevel();
    }

    public void nextLevel() {
        this.player.setLevel(this.player.getBeginnerLevel());
    }
}