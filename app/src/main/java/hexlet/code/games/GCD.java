package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    public static void getGame() {
        var rules = "Find the greatest common divisor of given numbers.\n";

        String[][] gameArray = new String[3][2];

        for (int i = 0; i < gameArray.length; i++) {
            int number1 = (int) (1 + Math.random() * 100);
            int number2 = (int) (1 + Math.random() * 100);
            gameArray[i][0] = number1 + " " + number2;

            while (number1 > 0 && number2 > 0) {
                if (number1 > number2) {
                    number1 = number1 % number2;
                } else {
                    number2 = number2 % number1;
                }
            }
            gameArray[i][1] = String.valueOf(Math.max(number1, number2));
        }
        Engine.getGame(rules, gameArray);
    }
}
