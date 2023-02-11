package State_pattern;

import State_pattern.Character.Character;

public class App {
    public static void main(String[] args) {
        Character jekim = new Character("jekim");

        jekim.jump();
        jekim.run();
        jekim.showState();
    }
}
