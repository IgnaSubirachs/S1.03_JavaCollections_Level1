import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class CountryGame {
    private HashMap<String, String> countries;
    private Player player;
    private QuestionManager questionManager;

    public CountryGame() {
        this.countries = FileManager.loadCountries("countries.txt");
    }

    public void startGame() {
        if (countries.isEmpty()) {
            System.out.println("Error: countries.txt is empty or not found. Please check the file.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        this.player = new Player(name);
        this.questionManager = new QuestionManager(countries, player);

        System.out.println("\nWelcome, " + name + "! Guess the capital of the following countries.\n");

        for (int i = 0; i < 10; i++) {
            questionManager.askQuestion(scanner);
        }

        System.out.println("\nGame over. Final score: " + player.getScore());
        ScoreManager.saveScore("scores.txt", player.getName(), player.getScore());
        scanner.close();
    }
}
