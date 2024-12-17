public class attack_move implements move {
    String name;
    String type;
    double damage;
    //boolean isAttack;

    public double getDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isAttack() {
        return true;
    }
}
