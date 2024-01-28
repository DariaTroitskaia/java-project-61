package hexlet.code;

public class Utils {
    public static int GETRANDOM(int min, int max) {
        var randomNumber = (int) (min + Math.random() * max);
        return randomNumber;
    }
}
