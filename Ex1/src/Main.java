import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> months = MonthManager.getMonths();
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

        HashSet<Month> monthSet = MonthManager.arrayToHash(months);
        boolean added = monthSet.add(new Month("January"));
        System.out.println("----------------");
        System.out.println("\nTrying to add again January in the HashSet...");
        System.out.println("Was it added correctly? " + added +" the HashSet don't allow duplicates");


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




