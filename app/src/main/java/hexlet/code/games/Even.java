package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static void getGame() {
        var rules = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";
        int countRounds = 3;
        String[][] gameArray = new String[countRounds][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
       Engine.getGame(rules, gameArray);
    }
    public static String[] generateRoundData() {
        int maxRandom = 100;
        int number = (int) (1 + Math.random() * maxRandom);
        String[] roundData = new String[2];
        roundData[0] = String.valueOf(number);
        roundData[1] = isEven(number);
        return roundData;
    }
    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
