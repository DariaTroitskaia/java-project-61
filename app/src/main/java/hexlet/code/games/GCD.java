package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final String RULES = "Find the greatest common divisor of given numbers.\n";
    public static void getGame() {
        String[][] gameArray = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
        Engine.run(RULES, gameArray);
    }
    public static String[] generateRoundData() {
        int number1 = Utils.getRandom();
        int number2 = Utils.getRandom();
        String[] roundData = new String[2];
        roundData[0] = number1 + " " + number2;
        roundData[1] = String.valueOf(calculateGcd(number1, number2));
        return roundData;
    }
    public static int calculateGcd(int number1, int number2) {
        while (number1 > 0 && number2 > 0) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }
        return Math.max(number1, number2);
    }
}
