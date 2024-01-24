package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String getName() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
