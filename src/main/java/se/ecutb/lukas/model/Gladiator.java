package se.ecutb.lukas.model;

public class Gladiator {

    private int strength;
    private String name;
    private int health;

    public Gladiator(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;

    }
    public String getDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append("Gladiator " + getName() + " Str: "+getStrength()+" HP: "+getHealth());
        return sb.toString();
    }
    public boolean isAlive(){
        return health > 0;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return strength;
    }
}
