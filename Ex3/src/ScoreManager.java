import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreManager {
    public static void saveScore(String filename, String name, int score) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            bw.write(name + ": " + score);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving score: " + e.getMessage());
        }
    }
}
