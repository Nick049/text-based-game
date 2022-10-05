import java.util.*;
public class Battle {
    Scanner input = new Scanner(System.in);
    Random num = new Random();
    //gets attack
    int minA = 1;
    int maxA = 4;
    int damadge = (int)Math.floor(Math.random() * (maxA - minA + 1) + minA);

    int LV_UP_EXP = 15;

    //gets player health
    int maxH = 30;
    int minH = 20;
    int maxHH = 25;
    int minHH = 35;

    //gets enemy health
    int maxEH = 15;
    int minEH = 7;

    int E1H = (int)Math.floor(Math.random() * (maxEH - minEH + 1) + minEH);
    int E2H = (int)Math.floor(Math.random() * (maxEH - minEH + 1) + minEH);
    int E3H = (int)Math.floor(Math.random() * (maxEH - minEH + 1) + minEH);

    //Char1 = attacker, Char2 = attacker, Char3 = healer
    int Char1H = (int)Math.floor(Math.random() * (maxH - minH + 1) + minH); //attacker
    int Char2H = (int)Math.floor(Math.random() * (maxH - minH + 1) + minH); //attacker
    int Char3H = (int)Math.floor(Math.random() * (maxHH - minHH + 1) + minH); //healer

    int LV = 1;

    public void menu(){
        System.out.println("Skeleton1: " + E1H + "Skeleton2: " + E2H + "Skeleton3: " + E3H);
        System.out.println("What would you like to do: (A)ttack, (H)eal, (S)tats");
        String move = input.nextLine();
        if(move.equalsIgnoreCase("A")){

        }
    }

}


Enemy.Ske