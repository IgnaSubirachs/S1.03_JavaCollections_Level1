import java.util.ArrayList;
import java.util.HashSet;

public class MonthManager {

    public static ArrayList<Month> getMonths() {
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
        return months;
    }

    public static HashSet<Month> arrayToHash(ArrayList<Month> months) {
        HashSet<Month> hashSet = new HashSet<>(months);
        return hashSet;
        }

    }

