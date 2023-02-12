// package State_pattern.Character.PlayerState;

// import State_pattern.Player;

// public class Dead extends PlayerState {
//     private Player player;
    
//     public Dead(Player player) {
//         this.player = player;
//     }

//     public void run() {
//         System.out.println("Player is dead");
//     }

//     public void attack() {
//         System.out.println("Player is dead");
//     }

//     public void jump() {
//         System.out.println("Player is dead");
//     }

//     public void showState() {
//         System.out.println("Player is dead");
//     }

//     public void getDamaged(int damage) {
//         System.out.println("Player is dead");
//     }

//     public void resurrect() {
//         this.player.setState(this.playe.getAliveState());
//         this.player.setHealth(50);
//         this.player.setStamina(30);
//     }
// }