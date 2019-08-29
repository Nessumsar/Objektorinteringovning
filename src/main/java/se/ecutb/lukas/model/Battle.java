package se.ecutb.lukas.model;

public class Battle {
    private Gladiator player, opponent;
    private int round;

    public Battle(Gladiator player, Gladiator opponent) {
        this.player = player;
        this.opponent = opponent;
        round = 1;
    }
    public boolean battle(){
        System.out.println(player.getDetails());
        System.out.println("******* VS *******");
        System.out.println(opponent.getDetails());

        while(player.isAlive() && opponent.isAlive()){ //innuti While blir själva striden
            System.out.println("Round: "+round);
            Round battleRound = new Round(round);
            battleRound.doRound(player, opponent);
            System.out.println(battleRound.getResult());
        }
            return player.isAlive();
    }

}
