package kr.ft.seoul.StatePattern;

import kr.ft.seoul.StatePattern.Player.Player;
import kr.ft.seoul.StatePattern.Game.Game;
import kr.ft.seoul.StatePattern.Game.GameBehavior.*;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        Game game;
        
        System.out.print("뭘 할까요? - (J)ump, (R)un, (T)urn : ");
        input = scanner.nextLine();
        if (input.compareTo("J") == 0) {
            game = new Game(new JumpBehavior());
        }
        else if (input.compareTo("R") == 0) {
            game = new Game(new RunBehavior());
        }
        else if (input.compareTo("T") == 0) {
            game = new Game(new TurnBehavior());
        }
        else {
            System.out.println("Bye Bye!!");
            return ;
        }
        game.play();
    }
}