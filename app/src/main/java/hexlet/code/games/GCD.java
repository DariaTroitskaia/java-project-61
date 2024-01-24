package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    public static void getGame() {
        var rules = "Find the greatest common divisor of given numbers.\n";
        int countRounds = 3;
        String[][] gameArray = new String[countRounds][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
        Engine.getGame(rules, gameArray);
    }
    public static String[] generateRoundData() {
        int maxRandom = 100;
        int number1 = (int) (1 + Math.random() * maxRandom);
        int number2 = (int) (1 + Math.random() * maxRandom);
        String[] roundData = new String[2];
        roundData[0] = number1 + " " + number2;
        roundData[1] = correctAnswer(number1, number2);
        return roundData;
    }
    public static String correctAnswer(int number1, int number2) {
        while (number1 > 0 && number2 > 0) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }
        return String.valueOf(Math.max(number1, number2));
    }
}
