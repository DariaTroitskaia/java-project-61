package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String getName() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner sc = new Scanner(System.in);
        var userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
