import java.util.Random;

/**
 * Created by dbaker on 1/22/2019.
 */
public class Enemy {
    private int  health;
    private double defense;
    private double attack;
    private int enemeyLevel;
    Random random = new Random();

    //constructor that will initialize the instance variables (properties)
    //the "this" key word refers to the object's variable instead of the function's input
    //in the case that they have the same name.
    public Enemy(int enemeyLevel, int baseHealth, double baseDef, double baseAttack){

        this.enemeyLevel = enemeyLevel;
        this.health = (random.nextInt(10)+10)*baseHealth * enemeyLevel;
        this.defense = (random.nextInt(5)+1)*baseDef * enemeyLevel;
        this.attack = (random.nextInt(5)+1)*baseAttack * enemeyLevel;
    }

    //getters (allow the programmers to see the values of the instance variables
    public int getHealth() {
        return health;
    }

    public double getDefense() {
        return defense;
    }

    public double getAttack() {
        return attack;
    }

    public int getEnemeyLevel() {
        return enemeyLevel;
    }

    //this is the function that allows the enemy to take damage, returns true if enemy is Alive
    //gives player XP if enemy died.
    public boolean takeDamage(Player player){
        double damage = (player.getAttack()) - defense;
        if (damage<1){
            damage = 1;
        }
        health = health - (int)damage;
        System.out.println("you attacked the enemy and they took: " + damage + " damage!");
        if(!isAlive()){
            System.out.println("you killed the enemy!");
            player.gainXP();
            return false;
        }
        return true;
    }

    //returns true if the enemy health>0
    public boolean isAlive(){
        return (health>0);
    }

}
