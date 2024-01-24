package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void getGame() {
        var rules = "What number is missing in the progression?\n";
        String[][] gameArray = new String[3][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
        Engine.getGame(rules, gameArray);
    }

    public static String[] generateRoundData(){
        String[] progression = new String[10];
        progression[0] = String.valueOf((int) (1 + Math.random()*100));
        int a = (int) (1 + Math.random() * 10);
        int index = (int) (1 + Math.random()*9);

        String progressionToString = progression[0];
        for (int j = 1; j < 10; j++) {
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
