package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void getGame() {
        var rules = "What number is missing in the progression?\n";
        String[][] gameArray = new String[Engine.countRounds][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
        Engine.getGame(rules, gameArray);
    }
    public static String[] generateRoundData() {
        int sizeOfProgression = 10;
        String[] progression = new String[sizeOfProgression];

        progression[0] = String.valueOf(Utils.getRandom(1, 100));
        int a = Utils.getRandom(1, 10);
        int index = Utils.getRandom(1, 9);

        String progressionToString = progression[0];
        for (int j = 1; j < sizeOfProgression; j++) {
            if (j == index) {
                progression[j] = "..";
            } else {
                progression[j] = String.valueOf(Integer.parseInt(progression[0]) + a * j);
            }
            progressionToString = progressionToString + " " + progression[j];
        }
        String[] roundData = new String[2];
        roundData[0] = progressionToString;
        roundData[1] = correctAnswer(Integer.parseInt(progression[0]), a, index);
        return roundData;
    }
    public static String correctAnswer(int number, int a, int index) {
        return String.valueOf(number + a * index);
    }
}
