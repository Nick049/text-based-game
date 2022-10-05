import java.util.*;
public class placeHolder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random num = new Random();
        //gets attack
        int minA = 1;
        int maxA = 4;
        int damadge = (int) Math.floor(Math.random() * (maxA - minA + 1) + minA);

        int LV_UP_EXP = 15;

        //gets player health
        int maxH = 30;
        int minH = 20;
        int maxHH = 25;
        int minHH = 35;
        int C1H = (int) Math.floor(Math.random() * (maxH - minH + 1) + minH);
        int C2H = (int) Math.floor(Math.random() * (maxH - minH + 1) + minH);
        int C3H = (int) Math.floor(Math.random() * (maxHH - minHH + 1) + minHH);


        //gets enemy health
        int maxEH = 15;
        int minEH = 7;
        int E1H = (int) Math.floor(Math.random() * (maxEH - minEH + 1) + minEH);
        int E2H = (int) Math.floor(Math.random() * (maxEH - minEH + 1) + minEH);
        int E3H = (int) Math.floor(Math.random() * (maxEH - minEH + 1) + minEH);

        //Char1 = attacker, Char2 = attacker, Char3 = healer
        int Char1H = (int) Math.floor(Math.random() * (maxH - minH + 1) + minH); //attacker
        int Char2H = (int) Math.floor(Math.random() * (maxH - minH + 1) + minH); //attacker
        int Char3H = (int) Math.floor(Math.random() * (maxHH - minHH + 1) + minH); //healer

        int LV = 1;

        System.out.println("Enemy(1):" + E1H +" Enemy(2):" + E2H + " Enemy(3):" + E3H);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Attacker(1):" + C1H + " Attacker(2)" + C2H + " Healer(3):" + C3H);
        System.out.println("What would you like to do: (A)ttack, (H)eal, (S)tats");
        String move = input.nextLine();
        if (move.equalsIgnoreCase("A")) {
            System.out.println("Who would you like to attack?(1)(2)(3)?");
            int AttackInput = Integer.parseInt(input.nextLine());
            if(AttackInput == 1){
                E1H = E1H - damadge;
            }

        }
    }
}