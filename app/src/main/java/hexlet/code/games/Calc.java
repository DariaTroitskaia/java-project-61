package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void getGame() {
        var rules = "What is the result of the expression?";
        int countRounds = 3;
        String[][] gameArray = new String[countRounds][2];
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = generateRoundData();
        }
        Engine.getGame(rules, gameArray);
    }
    public static String[] generateRoundData(){
        int maxRandom = 20;
        int number1 = (int) (1 + Math.random() * maxRandom);
        int number2 = (int) (1 + Math.random() * maxRandom);
        int index = (int) (Math.random() * 2);

        char[] operators = new char[] {'+', '-', '*'};
        String[] roundData = new String[2];
        roundData[0] = number1 + " " + operators[index] + " " + number2;
        roundData[1] = calculation(number1, number2, operators[index]);
        return roundData;
    }
    public static String calculation(int number1, int number2, char operator){
        switch (operator) {
            case '+':
                return String.valueOf(number1 + number2);
            case '-':
                return String.valueOf(number1 - number2);
            case '*':
                return String.valueOf(number1 * number2);
            default:
                return null;
        }
    }
}
