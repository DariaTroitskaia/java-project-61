package hexlet.code;

public class Utils {
    private static final int MAX_RANDOM = 100;
    public static int getRandom(int min, int max) {
        return (int) (min + Math.random() * max);
    }
    public static int getRandom() {
        return getRandom(1, MAX_RANDOM);
    }
}
