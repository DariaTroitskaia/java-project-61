package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void getGame(String rules, String[][] gameArray) {
        Cli.getHello();

        System.out.println("Welcome to the Brain Games!");
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
                        "Let's try again, " + hexlet.code.Cli.userName + "!");
                i = 3;
            }
        }
        if (countWins == 3) {
            System.out.println("Congratulations, " + hexlet.code.Cli.userName + "!");
        }
    }
}
