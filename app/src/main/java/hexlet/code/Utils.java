package hexlet.code;

public class Utils {
    public static int getRandom(int min, int max) {
        return (int) (min + Math.random() * max);
    }
    public static int getRandom() {
        return getRandom(1, 100);
    }
}
