package se.ecutb.lukas.model;

import java.util.concurrent.ThreadLocalRandom;

public class Round {

    private String result;
    private int roundnumber;
    private static ThreadLocalRandom random = ThreadLocalRandom.current();

    public Round(int roundnumber){
        this.roundnumber = roundnumber;
        this.result = " ";

    }
    public void doRound(Gladiator player, Gladiator opponent){
        int playerAttack = player.getStrength() + random.nextInt(1, 7); // ger 1-6
        int opponentAttack = opponent.getStrength()+ random.nextInt(1,7); //om det alltid ska vara 1 som random tar man 1 och 2;

        if (playerAttack >= opponentAttack){
            opponent.setHealth(opponent.getHealth()-1);
            result = player.getName()+" won round "+roundnumber+" and did damage to "+opponent.getName();
        } else if (playerAttack <= opponentAttack){
            player.setHealth(player.getHealth()-1);
            result = opponent.getName()+" won round "+roundnumber+" and did damage to "+player.getName();
        }
    }
    public String getResult(){
        return result;
    }
}
