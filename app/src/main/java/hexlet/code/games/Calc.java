package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String RULES = "What is the result of the expression?";
    public static void getGame() {

        String[][] gameArray = new String[Engine.COUNTROUNDS][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
        Engine.getGame(RULES, gameArray);
    }
    public static String[] generateRoundData() {
        int number1 = Utils.getRandom(1, 20);
        int number2 = Utils.getRandom(1, 20);
        int index = Utils.getRandom(0, 3);

        char[] operators = new char[] {'+', '-', '*'};
        String[] roundData = new String[2];
        roundData[0] = number1 + " " + operators[index] + " " + number2;
        roundData[1] = String.valueOf(calculation(number1, number2, operators[index]));
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
