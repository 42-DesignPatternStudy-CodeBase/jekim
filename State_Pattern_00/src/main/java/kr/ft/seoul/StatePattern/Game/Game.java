package kr.ft.seoul.StatePattern.Game;

import kr.ft.seoul.StatePattern.Player.Player;
import kr.ft.seoul.StatePattern.Game.GameBehavior.GameBehavior;
import java.util.Scanner;

public class Game {
    private GameBehavior gameBehavior;

    public Game(GameBehavior gameBehavior) {
        this.gameBehavior = gameBehavior;
    }

    public void play() {
        Player player = new Player("Noname");
        Scanner scanner = new Scanner(System.in);

        String input;
        while (true) {
            System.out.print(gameBehavior.getKeyword() + " 할까요? : ");
            input = scanner.nextLine();

            if (input.compareTo("Y") == 0) {
                gameBehavior.doBehavior(player);
            } else if (input.compareTo("N") == 0) {
                player.setLevel(player.getBeginnerLevel());
            } else {
                break ;
            }
        }
    }
}