package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String userName;
    public static void getHello() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
