package hexlet.code;

import hexlet.code.games.Greet;
import java.util.Scanner;

public class Engine {
    public static void getGame(String rules, String[][] gameArray) {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        var userName = Cli.getName();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        var countWins = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Question: " + gameArray[i][0]);
            System.out.print("Your answer: ");

            Scanner in = new Scanner(System.in);
            var usersAnswer = in.nextLine();

            if (gameArray[i][1].equalsIgnoreCase(usersAnswer)) {
                System.out.println("Correct!");
                countWins ++;
            } else {
                System.out.println("'" + usersAnswer + "'" +
                        " is wrong answer ;(. Correct answer was" + "'" + gameArray[i][1] +
                        "'.\n" +
                        "Let's try again, " + userName + "!");
                i = 3;
            }
        }
        if (countWins == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
