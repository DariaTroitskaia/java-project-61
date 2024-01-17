package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void getGame() {
        var rules = "What is the result of the expression?";

        char[] operators = new char[] {'+', '-', '*'};
        int index;
        String [][] gameArray = new String[3][2];

        for (int i = 0; i < gameArray.length; i++) {
            int number1 = (int) (1 + Math.random() * 20);
            int number2 = (int) (1 + Math.random() * 20);
            index = (int) (Math.random() * 2);
            gameArray[i][0]= String.valueOf(number1) + operators[index] + number2;

            switch (index) {
                case 0:
                    gameArray[i][1] = String.valueOf(number1 + number2);
                    break;
                case 1:
                    gameArray[i][1] = String.valueOf(number1 - number2);
                    break;
                case 2:
                    gameArray[i][1] = String.valueOf(number1 * number2);
                    break;
            }
        }
        Engine.getGame(rules, gameArray);
    }
}
