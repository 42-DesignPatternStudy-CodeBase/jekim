// package State_pattern.Character.PlayerState;

// import State_pattern.Player;

// public class Alive extends PlayerState {
//     private Player player;
    
//     public alive(Player player) {
//         this.player = player;
//     }

//     public void run() {
//         System.out.println("Player runned");
//     }

//     public void attack() {
//         System.out.println("Player attacked by " + this.player.getDamage());
//     }

//     public void jump() {
//         System.out.println("Player jumped");
//     }

//     public void showState() {
//         System.out.println("Player is alive");
//     }

//     public void getDamaged(int damage) {
//         int damagedHealth = this.player.getHealth() - damage;

//         if (damagedHealth <= 0) {
//             this.player.setHealth(0);
//             this.player.setStamina(0);
//             this.player.setState(this.Player.getDeadState());
//         } else {
//             this.player.setHealth(damagedHealth);
//         }
//     }
// }