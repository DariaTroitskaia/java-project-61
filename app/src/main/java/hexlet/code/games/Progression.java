package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void getGame() {
        var rules = "What number is missing in the progression?\n";

        String[] progression = new String[10];
        String[][] gameArray = new String[3][2];
        for (int i = 0; i < gameArray.length; i++) {
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

            gameArray[i][0] = progressionToString;
            gameArray[i][1] = String.valueOf(Integer.parseInt(progression[0]) + a * index);
        }
        Engine.getGame(rules, gameArray);
    }
}
