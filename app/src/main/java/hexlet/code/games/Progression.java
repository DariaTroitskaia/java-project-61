package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String RULES = "What number is missing in the progression?";
    private static final int SIZE = 10;
    private static final int MAX_RANDOM_FOR_STEP = 10;
    private static final int MAX_RANDOM_FOR_INDEX = 9;

    public static void startGame() {
        String[][] gameArray = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
        Engine.run(RULES, gameArray);
    }


    public static String[] generateRoundData() {
        int firstNumber = Utils.getRandom();
        int step = Utils.getRandom(1, MAX_RANDOM_FOR_STEP);
        int index = Utils.getRandom(1, MAX_RANDOM_FOR_INDEX);

        String[] progression = generateProgression(firstNumber, step, SIZE);

        var unknownNumber = progression[index];
        progression[index] = "..";
        String progressionToString = String.join(" ", progression);

        String[] roundData = new String[2];
        roundData[0] = progressionToString;
        roundData[1] = unknownNumber;
        return roundData;
    }


    public static String[] generateProgression(int firstNumber, int step, int size) {
        String[] progression = new String[size];
        progression[0] = String.valueOf(firstNumber);
        for (int i = 1; i < size; i++) {
                progression[i] = String.valueOf(firstNumber + step * i);
        }
        return progression;
    }
}


