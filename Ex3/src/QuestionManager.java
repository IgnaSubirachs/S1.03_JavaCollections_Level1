import java.util.*;

public class QuestionManager {
    private HashMap<String, String> countries;
    private Player player;
    private Random random;

    public QuestionManager(HashMap<String, String> countries, Player player) {
        this.countries = countries;
        this.player = player;
        this.random = new Random();
    }

    public void askQuestion(Scanner scanner) {
        List<String> countriesList = new ArrayList<>(countries.keySet());
        if (countriesList.isEmpty()) {
            System.out.println("No countries available to ask.");
            return;
        }
        String country = countriesList.get(random.nextInt(countriesList.size()));
        String capital = countries.get(country);

        System.out.print("What is the capital of " + country + "? ");
        String answer = scanner.nextLine().trim();

        if (answer.equalsIgnoreCase(capital)) {
            System.out.println("Correct!\n");
            player.incrementScore();
        } else {
            System.out.println("Incorrect. The correct capital is: " + capital + "\n");
        }
    }
}