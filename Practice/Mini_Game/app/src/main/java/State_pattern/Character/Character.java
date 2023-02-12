package State_pattern.Character;

import State_pattern.Character.CharacterState.CharacterState;

public class Character {
    protected String name;

    private CharacterState alive;
    private CharacterState currentState;
    
    private Character() {};

    public Character(String name) {
        this.name = name;
        this.alive = new CharacterState(this);

        this.currentState = alive;
    }

    public void jump() {
        currentState.jump();
    }

    public void run() {
        currentState.run();
    }

    public void showState() {
        currentState.showState();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}