package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";

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
        roundData[1] = isEven(number) ? "yes" : "no";
        return roundData;
    }


    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
