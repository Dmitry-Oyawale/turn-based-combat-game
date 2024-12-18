import java.util.Scanner;

public class Main1 {
    static Player player1 = new Player("You", new Lumivine(), new Pyronix());
    static Player player2 = new Player("You", new Pyronix(), new Lumivine());
    static Scanner scan = new Scanner(System.in);

    public static void switchPrint() {
        System.out.println("Which character would you like to switch to?");
        if (player1.getCharacter1().getHP() > 0 && player1.activeCharacter != player1.getCharacter1()) {
            System.out.print(player1.getCharacter1().getName());
        }
        if (player1.getCharacter2().getHP() > 0 && player1.activeCharacter != player1.getCharacter2()) {
            System.out.print(player1.getCharacter2().getName());
        }
        System.out.println();
        String r = scan.nextLine();
        if (r.equals(player1.getCharacter1().getName())) {
            if (player1.getCharacter1().getHP() > 0 && player1.activeCharacter != player1.getCharacter1()) {
                player1.switchActive(player1.getCharacter1());
            }

        }
        if (r.equals(player1.getCharacter2().getName())) {
            if (player1.getCharacter2().getHP() > 0 && player1.activeCharacter != player1.getCharacter2()) {
                player1.switchActive(player1.getCharacter2());
            }
        }
    }

    public static void switchPrint2() {
        if (player2.getCharacter1().getHP() > 0) {
            player2.switchActive(player2.getCharacter1());
        }
        else if (player2.getCharacter2().getHP() > 0) {
            player2.switchActive(player2.getCharacter2());
        }
    }

    public static void p1Attack(String c) {
        if (c.equals(player1.activeCharacter.getMove1().getName())) {
            if (player1.activeCharacter.getMove1() instanceof attack_move other) {
                player2.activeCharacter.takeDamage(other);
            }
            System.out.println(player1.activeCharacter.getName() + " used " + player1.activeCharacter.getMove1().getName());
        }
        if (c.equals(player1.activeCharacter.getMove2().getName())) {
            if (player1.activeCharacter.getMove2() instanceof attack_move other) {
                player2.activeCharacter.takeDamage(other);
            }
            System.out.println(player1.activeCharacter.getName() + " used " + player1.activeCharacter.getMove2().getName());
        }
        if (c.equals(player1.activeCharacter.getMove3().getName())) {
            if (player1.activeCharacter.getMove3() instanceof attack_move other) {
                player2.activeCharacter.takeDamage(other);
            }
            System.out.println(player1.activeCharacter.getName() + " used " + player1.activeCharacter.getMove3().getName());
        }
        if (c.equals(player1.activeCharacter.getMove4().getName())) {
            if (player1.activeCharacter.getMove4() instanceof attack_move other) {
                player2.activeCharacter.takeDamage(other);
            }
            System.out.println(player1.activeCharacter.getName() + " used " + player1.activeCharacter.getMove4().getName());
        }
    }

    public static boolean checkFaint2() {
        if (player2.activeCharacter.getHP() <= 0)
        {
            return true;
        }
        return false;
    }

    public static void p2Attack() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        if (randomNumber == 1) {
            if (player2.activeCharacter.getMove1() instanceof attack_move other) {
                player1.activeCharacter.takeDamage(other);
            }
            System.out.println(player2.activeCharacter.getName() + " used " + player2.activeCharacter.getMove1().getName());
        }
        if (randomNumber == 2) {
            if (player2.activeCharacter.getMove2() instanceof attack_move other) {
                player1.activeCharacter.takeDamage(other);
            }
            System.out.println(player2.activeCharacter.getName() + " used " + player2.activeCharacter.getMove2().getName());
        }
        if (randomNumber == 3) {
            if (player2.activeCharacter.getMove3() instanceof attack_move other) {
                player1.activeCharacter.takeDamage(other);
            }
            System.out.println(player2.activeCharacter.getName() + " used " + player2.activeCharacter.getMove3().getName());
        }
        if (randomNumber == 4) {
            if (player2.activeCharacter.getMove4() instanceof attack_move other) {
                player1.activeCharacter.takeDamage(other);
            }
            System.out.println(player2.activeCharacter.getName() + " used " + player2.activeCharacter.getMove4().getName());
        }
    }

    public static boolean checkFaint1() {
        if (player1.activeCharacter.getHP() <= 0)
        {
                return true;
        }
        return false;
    }

    public static void printStats() {
        System.out.println("Your pokemon: HP: " + player1.activeCharacter.getHP());
        System.out.println("Their pokemon: HP: " + player2.activeCharacter.getHP());
    }

    public static void Battle() {
        System.out.println("What move will you use? " + player1.activeCharacter.getMove1().getName() + " " +
                player1.activeCharacter.getMove2().getName() + " " + player1.activeCharacter.getMove3().getName() + " "
                + player1.activeCharacter.getMove4().getName() + " Switch");
        printStats();

        String c = scan.nextLine();
        //switch
        if (c.equals("Switch")) {
            switchPrint();
            p2Attack();
            if (checkFaint1()) {
                printStats();
                switchPrint();
                Battle();
            }
            else {
                printStats();
                Battle();
            }

        }
        //execute the move
        else if (player1.activeCharacter.getSpeed() >= player2.activeCharacter.getSpeed()) {
            p1Attack(c);
            if (player2.checkLost())
            {
                printStats();
                System.out.println("You win");
            }
            else if (checkFaint2()) {
                printStats();
                switchPrint2();
                Battle();
            }
            else {
                printStats();
                p2Attack();
                if (player1.checkLost()) {
                    printStats();
                    System.out.println("You lost");
                }
                else if (checkFaint1()) {
                    printStats();
                    switchPrint();
                    Battle();
                }
                else {
                    printStats();
                    Battle();
                }
            }

        }
        else {
            p2Attack();
            if (player1.checkLost())
            {
                printStats();
                System.out.println("You lost");
            }
            else if (checkFaint1()) {
                printStats();
                switchPrint();
                Battle();
            }
            else {
                printStats();
                p1Attack(c);
                if (player2.checkLost())
                {
                    printStats();
                    System.out.println("You win");
                }
                else if (checkFaint2()) {
                    printStats();
                    switchPrint2();
                    Battle();
                }
                else {
                    printStats();
                    Battle();
                }
            }
        }
    }

    public static void main(String[] args) {
        Battle();
    }
}
