/**
 * Created by cp8500 on 10/5/2022.
 */
import java.util.*;
public class Battle {
    Scanner input = new Scanner(System.in);
    Random num = new Random();
    int min = 1;
    int max = 4;
    int damadge = (int)Math.floor(Math.random() * (max - min + 1) + min);
    public void menu(){
        System.out.println("What would you like to do: (A)ttack, (H)eal, (S)tats");
        String move = input.nextLine();
        if(move.equalsIgnoreCase("A")){

        }
    }

    int LV_UP_EXP = 15;


    int maxH = 30;
    int minH = 20;
    int maxHH = 25;
    int minHH = 35;
    //Char1 = attacker, Char2 = attacker, Char3 = healer
    int Char1H = (int)Math.floor(Math.random() * (maxH - minH + 1) + min); //attacker
    int Char2H = (int)Math.floor(Math.random() * (maxH - minH + 1) + min); //attacker
    int Char3H = (int)Math.floor(Math.random() * (maxHH - minHH + 1) + min); //healer





}
