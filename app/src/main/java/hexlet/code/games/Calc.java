package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String RULES = "What is the result of the expression?";
    private static final char[] OPERATORS = new char[] {'+', '-', '*'};
    private static final int MAX_RANDOM = 20;
    public static void getGame() {
        String[][] gameArray = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
        Engine.run(RULES, gameArray);
    }
    public static String[] generateRoundData() {
        int number1 = Utils.getRandom(1, MAX_RANDOM);
        int number2 = Utils.getRandom(1, MAX_RANDOM);
        int index = Utils.getRandom(0, OPERATORS.length);


        String[] roundData = new String[2];
        roundData[0] = number1 + " " + OPERATORS[index] + " " + number2;
        roundData[1] = String.valueOf(calculation(number1, number2, OPERATORS[index]));
        return roundData;
    }
    public static int calculation(int number1, int number2, char operator) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new RuntimeException("Unknown operator");
        }
    }
}
