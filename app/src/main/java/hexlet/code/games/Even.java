package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";
    public static void getGame() {
        String[][] gameArray = new String[Engine.COUNTROUNDS][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
       Engine.getGame(RULES, gameArray);
    }
    public static String[] generateRoundData() {
        int number = Utils.getRandom(1, 100);
        String[] roundData = new String[2];
        roundData[0] = String.valueOf(number);
        roundData[1] = isEven(number) ? "yes" : "no";
        return roundData;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
