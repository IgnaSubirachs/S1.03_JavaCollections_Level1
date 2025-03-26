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
        months.add(7, new Month("August"));

        for (Month month : months) {
            System.out.println(month.getName());
        }

        HashSet<Month> monthSet = new HashSet<>(months);
        boolean added = monthSet.add(new Month("January"));
        System.out.println("\nTrying to add again in the HashSet...");
        System.out.println("Was it added correctly? " + added);

        for (Month month : monthSet) {
            System.out.println(month);
        }
        Iterator<Month> iterator = monthSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}




