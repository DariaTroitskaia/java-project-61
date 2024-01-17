package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void getGame() {
        var rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";

        String[][] gameArray = new String[3][2];
        for (int i = 0; i < gameArray.length; i++) {
            boolean isPrime = true;
            int number = (int) (1 + Math.random() * 100);
            gameArray[i][0] = String.valueOf(number);

            if (number < 2) {
                isPrime = false;
            }
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                gameArray[i][1] = "yes";
            } else {
                gameArray[i][1] = "no";
            }
        }
        Engine.getGame(rules, gameArray);
    }
}
