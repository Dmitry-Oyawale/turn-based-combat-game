import java.util.Scanner;

public class Battle {
    static Player player1 = new Player("You", new Lumivine(), new Pyronix());
    static Player player2 = new Player("You", new Pyronix(), new Lumivine());
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What move will you use?" + player1.activeCharacter.getMove1().getName() +
            player1.activeCharacter.getMove2().getName() + player1.activeCharacter.getMove3().getName() +
                player1.activeCharacter.getMove4().getName() + "Switch");
        //next four conditionals: executes the move
        if (scan.nextLine().equals(player1.activeCharacter.getMove1().getName())) {
            if (player1.activeCharacter.getMove1() instanceof attack_move other) {
                player2.activeCharacter.takeDamage(other);
            }
        }
        if (scan.nextLine().equals(player1.activeCharacter.getMove2().getName())) {
            if (player1.activeCharacter.getMove2() instanceof attack_move other) {
                player2.activeCharacter.takeDamage(other);
            }
        }
        if (scan.nextLine().equals(player1.activeCharacter.getMove3().getName())) {
            if (player1.activeCharacter.getMove3() instanceof attack_move other) {
                player2.activeCharacter.takeDamage(other);
            }
        }
        if (scan.nextLine().equals(player1.activeCharacter.getMove4().getName())) {
            if (player1.activeCharacter.getMove4() instanceof attack_move other) {
                player2.activeCharacter.takeDamage(other);
            }
        }
        if (scan.nextLine().equals("Switch")) {
            System.out.println("Which character would you like to switch to?");
            if (player1.getCharacter1().getHP() > 0 && player1.activeCharacter != player1.getCharacter1()) {
                System.out.print(player1.getCharacter1().getName());
            }
            if (player1.getCharacter2().getHP() > 0 && player1.activeCharacter != player1.getCharacter2()) {
                System.out.print(player1.getCharacter2().getName());
            }
            if (scan.nextLine().equals(player1.getCharacter1().getName())) {
                if (player1.getCharacter1().getHP() > 0 && player1.activeCharacter != player1.getCharacter1()) {
                    player1.switchActive(player1.getCharacter1());
                }
            }
            if (scan.nextLine().equals(player1.getCharacter2().getName())) {
                if (player1.getCharacter2().getHP() > 0 && player1.activeCharacter != player1.getCharacter2()) {
                    player1.switchActive(player1.getCharacter2());
                }
            }
        }
        
    }
}
