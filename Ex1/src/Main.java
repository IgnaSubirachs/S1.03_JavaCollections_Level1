import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();
        Month month1 = new Month("January");
        Month month2 = new Month("February");
        Month month3 = new Month("March");
        Month month4 = new Month("April");
        Month month5 = new Month("May");
        Month month6 = new Month("June");
        Month month7 = new Month("July");
        Month month9 = new Month("September");
        Month month10 = new Month("October");
        Month month11 = new Month("November");
        Month month12 = new Month("December");
        months.add(month1);
        months.add(month2);
        months.add(month3);
        months.add(month4);
        months.add(month5);
        months.add(month6);
        months.add(month7);
        months.add(month9);
        months.add(month10);
        months.add(month11);
        months.add(month12);
        System.out.println("Initial list of months (excluding August):");
        System.out.println(months);
        months.add(7, new Month("August"));
        System.out.println("List after inserting August in correct position:");
        System.out.println(months);
        System.out.println("--------------");
        System.out.println("List of Months using Loop: ");
        for (Month month : months) {
            System.out.println(month.getName());
        }

        HashSet<Month> monthSet = new HashSet<>(months);
        boolean added = monthSet.add(new Month("January"));
        System.out.println("----------------");
        System.out.println("\nTrying to add again Janueary in the HashSet...");
        System.out.println("Was it added correctly? " + added);

        System.out.println("----------------");
        System.out.println("Iterating using for loop:");
        for (Month month : monthSet) {
            System.out.println(month);
        }
        System.out.println("----------------");
        System.out.println("Iterating using Iterator:");
        Iterator<Month> iterator = monthSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}




