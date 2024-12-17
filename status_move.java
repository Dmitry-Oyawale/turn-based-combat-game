public class status_move implements move {
    String name;
    String type;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isAttack() {
        return false;
    }
}
