public class Player {
    private String name;
    private character character1;
    private character character2;
    public character activeCharacter;

    public Player(String name, character character1, character character2) {
        this.name = name;
        this.character1 = character1;
        this.character2 = character2;
        this.activeCharacter = character1;
    }

    public void switchActive(character activeCharacter) {
        this.activeCharacter = activeCharacter;
    }

    public boolean checkLost() {
        if (character1.getHP() == 0 && character2.getHP() == 0) {
            return true;
        }
        return false;
    }

    public character getCharacter1() {
        return character1;
    }

    public character getCharacter2() {
        return character2;
    }
}
