import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("First integer list" + numbers);
        List<Integer> numbersReversed = new ArrayList<>();
        ListIterator<Integer> iterator = numbers.listIterator(numbers.size());
        while (iterator.hasPrevious()) {
            numbersReversed.add(iterator.previous());
        }
        System.out.println("Second integer reversed list" + numbersReversed);

    }
}