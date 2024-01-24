package hexlet.code.games;

import hexlet.code.Cli;

public class Greet {
    public static void sayHello() {
        System.out.println("Welcome to the Brain Games!\n"
        + "May I have your name?");
        System.out.println("Hello, " + Cli.getName() + "!");
    }
}
