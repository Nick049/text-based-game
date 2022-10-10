import java.util.*;
public class Player {

    private int  health;
    private int defense;
    private int attack;
    private int playerLevel;
    private int healthMoves;

    int minA = 1;
    int maxA = 4;

    int minH = 20;
    int maxH = 30;
    int minHH = 25;
    int maxhh = 35;


    private int xp;

    //constructor that will initialize the instance variables (properties)
    //the "this" key word refers to the object's variable instead of the function's input
    //in the case that they have the same name.
    public Player(){
        this.playerLevel = 1;
        //health
        double doubleHealth = Math.random() * 5;
        health = (int)doubleHealth;
        //defense
        double doubleDef = Math.random() * 5;
        defense = (int)doubleDef;
        //attack
        double doubleAttack = Math.random() * 5;
        health = (int)doubleAttack;


        healthMoves = 2;
    }

    //getters (allow the programmers to see the values of the instance variables
    private int getHealth() {return health; }

    private int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public int getXP(){return xp;}

    //used to get input from the user will allow them to see stats use heal or attack
    public void menu(Enemy enemy){
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to do? heal or attack or stats");
            String answer;
            if(healthMoves > 0) {
                answer = "heal";
            }
            else {
                answer = "attack";
            }

            if (answer.equalsIgnoreCase("heal")) {
                heal();
            } else if (answer.equalsIgnoreCase("attack")) {
                return;  //exits out and attacks
            } else if (answer.equalsIgnoreCase("stats")) {
                System.out.println("your stats:");
                System.out.println("level:   " + getPlayerLevel());
                System.out.println("health:  " + getHealth());
                System.out.println("attack:  " + getAttack());
                System.out.println("defense: " + getDefense());
                System.out.println("potions: " + healthMoves);
                System.out.println("enemy stats:");
                System.out.println("health:  " + enemy.getHealth());
                System.out.println("attack:  " + enemy.getAttack());
                System.out.println("defense: " + enemy.getDefense());
            }
        }
    }

    //this is the function that allows the player to take damage
    //returns true if player is alive
    public boolean takeDamage(Enemy enemy){
        int damage = (enemy.getAttack()) - defense;
        if (damage<1){
            damage = 1;
        }
        health = health - damage;
        System.out.println("the enemy attacked you and you took: " + damage+ " damage!");
        if(isAlive()){
            return  true;
        }
        System.out.println("you died.");
        return false;
    }

    //returns true if the player health>0
    public boolean isAlive(){
        return (health > 0);
    }

    //call to use a health potion
    private void heal(){
        if(healthMoves >0){
            healthMoves--;
            health = health +50;
            System.out.println("you drank one potion and restored 50 health, you now have "+health+" health");
        }
        else{
            System.out.println("you have no health potions");
        }
    }

    //called when player kills an enemy (should not need to be called in main)
    public void gainXP(){
        xp++;
        //if they leveled up
        if (xp>(int) (5*Math.pow(1.3,playerLevel))){
            playerLevel++;
            System.out.println("you are now level: " + playerLevel);
            healthMoves = healthMoves+2;
            attack = attack +3;
            defense = defense + 1;
        }
    }
}
