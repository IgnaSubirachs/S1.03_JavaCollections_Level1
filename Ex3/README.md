# 🌍 Country Capital Quiz Game

📄 **Description - Exercise Statement**

This Java application is a country-capital quiz game that reads data from a file and tests the user's geography knowledge.

**Exercise 3**  
Given a `countries.txt` file containing country-capital pairs, the program loads this data into a `HashMap<String, String>`.  
The user is prompted to enter their name. Then, the game randomly selects a country from the map and asks the user to enter the capital. If the user answers correctly, they earn a point.  
This process repeats 10 times. At the end of the game, the user's name and score are saved to a file called `scores.txt`.

---

💻 **Technologies Used**

- Java 17+
- Java Collections Framework (`HashMap`)
- File I/O (`Scanner`, `BufferedReader`, `FileWriter`)
- Randomization with `Random`
- IDE (e.g., IntelliJ IDEA, Eclipse)

---

📋 **Requirements**

- JDK 17 or higher installed
- A Java IDE (IntelliJ IDEA, Eclipse, or others)
- A `countries.txt` file with country-capital pairs (e.g., `France:Paris`)

---

🛠️ **Installation**

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/country-quiz-game.git
   ```
2. Open the project in your preferred Java IDE.
3. Ensure the file `countries.txt` is placed in the root directory.
4. Make sure the JDK is set to version 17 or higher.

---

▶️ **Execution**

1. Locate and open the `Main.java` file.
2. Run the `main()` method.
3. The program will:
    - Ask for your name
    - Present 10 random countries and prompt for their capitals
    - Display the final score
    - Save the score to `scores.txt`

---

✅ **Features Demonstrated**

- Reading from external files into a `HashMap`
- Random selection from a map
- Input/output operations using `Scanner` and file writers
- Score tracking and persistence in a file

---

📌 **Example Output**
```
Enter your name: Alex

Welcome, Alex! Guess the capital of the following countries.

1. What is the capital of Canada?
> Ottawa

2. What is the capital of Germany?
> Berlin

...

Game over. Final score: 7
```

---

📁 **Project Structure**
```
🌍 country-quiz-game
 ├ 📜 CountryGame.java
 ├ 📜 Player.java
 ├ 📜 QuestionManager.java
 ├ 📜 FileManager.java
 ├ 📜 ScoreManager.java
 ├ 📜 countries.txt
 ├ 📜 scores.txt
 └ 📜 README.md
```

