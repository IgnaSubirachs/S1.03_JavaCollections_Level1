import java.io.*;
import java.util.HashMap;

class FileManager {
    public static HashMap<String, String> loadCountries(String filename) {
        System.out.println("Looking for file at: " + new File(filename).getAbsolutePath());
        HashMap<String, String> countries = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String country = parts[0].trim().replace("_", " ");
                    String capital = parts[1].trim().replace("_", " ");
                    countries.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return countries;
    }
}
