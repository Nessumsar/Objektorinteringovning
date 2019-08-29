package se.ecutb.lukas;

import se.ecutb.lukas.model.Battle;
import se.ecutb.lukas.model.Gladiator;

public class App
{
    public static void main( String[] args )
    {

        Gladiator player = new Gladiator("Olof", 6, 5);
        Gladiator opponent = new Gladiator("Krille", 5, 5);

        Battle battle = new Battle(player, opponent);
            boolean result = battle.battle();
        if (result){
            System.out.println("WINNER");
            System.out.println(player.getDetails());
    } else{
            System.out.println("You lost to: "+opponent.getDetails());
        }

    }

}
