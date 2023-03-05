package kr.ft.seoul.StatePattern.Player;

// state = BEGINNER, ADVANCED, SUPERB
import kr.ft.seoul.StatePattern.Player.PlayerLevel.*;

public class Player {
    String  name;

    PlayerLevel tutorial;
    PlayerLevel beginner;
    PlayerLevel advanced;
    PlayerLevel superb;
    
    PlayerLevel currentLevel;

    private Player() {};
    public Player(String name) {
        this.tutorial = new TutorialLevel(this);
        this.beginner = new BeginnerLevel(this);
        this.advanced = new AdvancedLevel(this);
        this.superb = new SuperbLevel(this);
        
        this.name = name;
        this.currentLevel = this.tutorial;
    }

    public void jump() {
        this.currentLevel.jump();
    }

    public void run() {
        this.currentLevel.run();
    }

    public void turn() {
        this.currentLevel.turn();
    }

    public PlayerLevel getLevel() {
        return this.currentLevel;
    }

    public void setLevel(PlayerLevel level) {
        this.currentLevel = level;
    }

   public PlayerLevel getBeginnerLevel() {
       return this.beginner;
   }

   public PlayerLevel getAdvancedLevel() {
       return this.advanced;
   }

   public PlayerLevel getSuperbLevel() {
       return this.superb;
   }
}


// tutorial -> beginner -> advanced -> superb