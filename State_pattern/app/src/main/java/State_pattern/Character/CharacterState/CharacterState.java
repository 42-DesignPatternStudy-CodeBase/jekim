package State_pattern.Character.CharacterState;

import State_pattern.Character.CharacterState.Behaviors.*;

public class CharacterState implements CommonState, Jumpable, Runnable {
    protected Character character;

    private CharacterState() {};

    public CharacterState(Character character) {
        this.Character = character;
    }

    @Override
    public void run() {
        System.out.println(this.character.getName() + " is running...");
    }
    
    @Override
    public void jump() {
        System.out.println(this.character.getName() + " is jumping...");
    }

    @Override
    public void showState() {
        System.out.println(this.character.getName() + " is here!");
    }
}