package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!\n"
                + "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        Scanner in = new Scanner(System.in);
        var usersChoice = in.nextLine();
        var messageChoice = "Your choice: " + usersChoice;
        System.out.println(messageChoice);

        switch (usersChoice) {
            case "1":
                Cli.getName();
                break;
            case "2":
                Even.startGame();
                break;
            case "3":
                Calc.startGame();
                break;
            case "4":
                GCD.startGame();
                break;
            case "5":
                Progression.startGame();
                break;
            case "6":
                Prime.startGame();
                break;
            default:
                break;
        }
    }
}
