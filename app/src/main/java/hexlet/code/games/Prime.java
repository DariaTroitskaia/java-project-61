package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void getGame() {
        var rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";
        String[][] gameArray = new String[Engine.countRounds][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
        Engine.getGame(rules, gameArray);
    }
    public static String[] generateRoundData() {
        int number = Utils.GETRANDOM(1, 100);
        String[] roundData = new String[2];
        roundData[0] = String.valueOf(number);
        roundData[1] = correctAnswer(number);
        return roundData;
    }
    public static String correctAnswer(int number) {
        boolean isPrime = number >= 2;
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return "yes";
        } else {
            return "no";
        }
    }
}
