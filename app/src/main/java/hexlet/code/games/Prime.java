package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";
    public static void startGame() {
        String[][] gameArray = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
        Engine.run(RULES, gameArray);
    }


    public static String[] generateRoundData() {
        int number = Utils.getRandom();
        String[] roundData = new String[2];
        roundData[0] = String.valueOf(number);
        roundData[1] = isPrime(number) ? "yes" : "no";
        return roundData;
    }


    public static boolean isPrime(int number) {
        boolean isPrime = number >= 2;
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
