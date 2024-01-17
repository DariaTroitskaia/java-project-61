package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "0 - Exit");
        Scanner in = new Scanner(System.in);
        var usersChoice = in.nextInt();
        var messageChoice = "Your choice: " + usersChoice;
        System.out.println(messageChoice);

        if (usersChoice == 1) {
            Cli.getHello();
        } else if (usersChoice == 2) {
            Even.getGame();
        }
        else if (usersChoice == 3) {
            Calc.getGame();
        }
    }
}
