import java.util.ArrayList;

public class Pyronix extends character{
    /*double a, double b, double c, double d, abilityStrat e,
    move f, move g, move h, move i */

    public Pyronix(){

        this.name = "Pyronix";
        this.HP = 80;
        this.attack = 75;
        this.defense = 50;
        this.speed = 100;
        this.strategy = new speed_boost();
        ArrayList<String> type = new ArrayList<>();
        type.add("Fire");

        this.move1 = new avalanche();
        this.move2 = new inflammation();
        this.move3 = new Bite();
        this.move4 = new Inferno();
    }

    public void takeDamage(attack_move n) {
        if (n.getType().equals("Water") || n.getType().equals("Rock"))
        {
            currentHP -= (n.getDamage() * 2);
        }
        if (n.getType().equals("Grass") || n.getType().equals("Ice"))
        {
            currentHP -= (n.getDamage()/2);
        }
        else
        {
            currentHP -= n.getDamage();
        }
        // factor in attack, defense later

    }

}
