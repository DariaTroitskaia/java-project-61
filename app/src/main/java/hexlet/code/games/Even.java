package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static void getGame() {
        var rules = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";
        String[][] gameArray = new String[3][2];

        for (int i = 0; i < gameArray.length; i++) {
            int number = (int) (1 + Math.random() * 100);
            var even = number % 2 == 0;
            gameArray[i][0] = String.valueOf(number);
            gameArray[i][1] = even ? "yes" : "no";
        }

       Engine.getGame(rules, gameArray);
    }
}
