import java.util.ArrayList;

public abstract class character {
    String name;
    double HP;
    double attack;
    double defense;
    double speed;
    abilityStrat strategy;
    ArrayList<String> type = new ArrayList<>();

    move move1;
    move move2;
    move move3;
    move move4;

    double currentHP;
    double currentAttack;
    double currentDefense;
    double currentSpeed;
    /*
    public character(String a, double b, double c, double d, double e, abilityStrat f,
                     ArrayList<String> g, moves h, moves i, moves j, moves k) {
        this.name = a;
        HP = b;
    } */

    public void takeDamage(attack_move n) {
        HP -= n.getDamage();
        // factor in attack, defense later
    }

    public double getHP() {
        if (currentHP < 0) {
            return 0;
        }
        return currentHP;
    }

    public move getMove1() {
        return move1;
    }
    public move getMove2() {
        return move2;
    }
    public move getMove3() {
        return move3;
    }
    public move getMove4() {
        return move4;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return currentSpeed;
    }

    public void recover() {
        this.currentHP = HP;
        this.currentAttack = currentAttack;
        this.currentDefense = currentDefense;
        this.currentSpeed = currentSpeed;
    }
}
