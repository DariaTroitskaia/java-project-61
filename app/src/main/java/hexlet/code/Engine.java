package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;


    public static void run(String rules, String[][] gameArray) {
        var userName = Cli.getName();
        System.out.println(rules);

        for (String[] correctAnswer:gameArray) {
            System.out.println("Question: " + correctAnswer[0]);
            System.out.print("Your answer: ");

            Scanner in = new Scanner(System.in);
            var usersAnswer = in.nextLine();

            if (correctAnswer[1].equalsIgnoreCase(usersAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usersAnswer + "'"
                        + " is wrong answer ;(. Correct answer was" + "'" + correctAnswer[1]
                        + "'.\n"
                        + "Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
