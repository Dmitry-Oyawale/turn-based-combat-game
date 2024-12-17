import java.util.ArrayList;

public class Lumivine extends character{
    /*double a, double b, double c, double d, abilityStrat e,
    move f, move g, move h, move i */

    public Lumivine(){

        this.name = "Lumivine";
        this.HP = 60;
        this.attack = 67;
        this.defense = 85;
        this.speed = 116;
        this.strategy = new speed_boost();
        ArrayList<String> type = new ArrayList<>();
        type.add("Grass");
        type.add("Fairy");

        this.move1 = new tackle();
        this.move2 = new leaf_whip();
        this.move3 = new Bite();
        this.move4 = new Inferno();
    }

    @Override
    public void takeDamage(attack_move n) {
        if (n.getType().equals("Fire") || n.getType().equals("Poison"))
        {
            currentHP -= (n.getDamage() * 2);
        }
        if (n.getType().equals("Water") || n.getType().equals("Electric"))
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
