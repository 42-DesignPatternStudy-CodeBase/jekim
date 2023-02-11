// package State_pattern.Character;

// import State_pattern.PlayerState.*;

// public class Player {
//     private String  name;
//     private int     health;
//     private int     stamina;
//     private int     damage;

//     PlayerState     alive;
//     PlayerState     dead;
//     PlayerState     currentState;

//     public Player() {
//         this.name = "Noname";
//         this.health = 100;
//         this.sp = 100;
//         this.attack = 20;

//         this.alive = new Alive(this);
//         this.dead = new Dead(this);
//         this.state = this.alive;
//     }

//     public Player(String name) {
//         this.name = name;
//         this.health = 100;
//         this.sp = 100;
//         this.attack = 20;

//         this.alive = new Alive(this);
//         this.dead = new Dead(this);
//         this.state = this.alive;
//     }

//     public void run() {
//         currentState.run();
//     }

//     public void attack() {
//         currentState.attack();
//     }

//     public void jump() {
//         currentState.jump();
//     }

//     public getDamaged(int damage) {
//         currentState.getDamage(damage);
//     }

//     public void showState() {
//         currentState.showState();
//     }

//     private void setState(PlayerState state) {
//         this.currentState = state;
//     }


//     // getter & setter /////////
//     public int getHealth(void) {
//         return this.health;
//     }

//     public int getStamina(void) {
//         return this.stamina;
//     }

//     public int getDamage(void) {
//         return this.damage;
//     }

//     public PlayerState getDeadState() {
//         return this.dead;
//     }

//     public PlayerState getDeadState() {
//         return this.alive;
//     }

//     public void setHealth(int add) {
//         this.health += add;
//     }

//     public void setStamina(int add) {
//         this.stamina += add;
//     }

//     public void setDamage(int add) {
//         this.damage += add;
//     }
// }
