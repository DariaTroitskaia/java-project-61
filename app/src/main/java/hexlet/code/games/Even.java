package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void getGame() {
        var rules = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";
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
        roundData[1] = isEven(number);
        return roundData;
    }
    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
