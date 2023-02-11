package State_pattern.Player.PlayerState;

public interface PlayerState {
    public void run();
    public void attack();
    public void jump();
    public void showState;
}