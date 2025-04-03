# 📅 Month Management System

📄 **Description - Exercise Statement**

This Java application implements the management of months using `ArrayList` and `HashSet` collections.

**Exercise 1**  
Create a class called `Month` with one attribute: `name` (a `String` storing the name of a month).  
Add 11 `Month` objects (each with a different name) to an `ArrayList`, excluding the month of "August". Then insert "August" into the correct position to ensure the chronological order is maintained.

Convert the previously created `ArrayList` into a `HashSet` and verify that it does not allow duplicates.

Finally, traverse the list using both a regular `for` loop and an `Iterator`.

---

💻 **Technologies Used**

- Java 17+
- Java Collections Framework (`ArrayList`, `HashSet`, `Iterator`)
- IDE (e.g., IntelliJ IDEA, Eclipse)

---

📋 **Requirements**

- JDK 17 or higher installed
- A Java IDE (IntelliJ IDEA, Eclipse, or others)
- No external libraries required

---

🛠️ **Installation**

1. Clone the repository:
   ```bash
   git clone https://github.com/IgnaSubirachs/S1.03_JavaCollections_Level1.git
   ```
2. Open the project in your preferred Java IDE.
3. Make sure the JDK is set to version 17 or higher.

---

▶️ **Execution**

1. Locate and open the `Main.java` file.
2. Run the `main()` method.
3. The following will be printed to the console:
    - The initial list of 11 months.
    - The list with "August" inserted in the correct position.
    - The list converted into a `HashSet`, showing how duplicates are avoided.
    - The list traversed using a `for` loop and an `Iterator`.

---

✅ **Features Demonstrated**

- Insertion of elements at specific indices in an `ArrayList`
- Conversion from `ArrayList` to `HashSet`
- Duplicate handling in `HashSet`
- Traversal of collections using a `for` loop and an `Iterator`
- Use of custom `toString()` methods for clean output

---

📌 **Example Output**
```
Initial list of months (excluding August):
January
February
...
December

List after inserting August in correct position:
January
February
...
August
...
December

HashSet output (no duplicates allowed):
...

Iterating using for loop:
...

Iterating using Iterator:
...
```

---

📁 **Project Structure**
```
📆 month-management
 ├ 📌 Main.java
 ├ 📌 Month.java
 └ 📌 README.md
```