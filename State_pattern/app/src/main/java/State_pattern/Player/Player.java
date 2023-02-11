package State_pattern.Player;

import State_pattern.PlayerState.*;

public class Player {
    private String  name;
    private int     health;
    private int     mana;

    PlayerState     alive;
    PlayerState     dead;
    PlayerState     currentState;

    public Player() {
        this.name = "Noname";
        this.health = 100;
        this.
    }
}