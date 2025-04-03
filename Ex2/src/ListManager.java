import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListManager {
    public static List<Integer> getIntegers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("First integer list" + numbers);
        return numbers;
    }

    public static List<Integer> reversedInteger(List<Integer> numbers) {
        List<Integer> integerReversed = new ArrayList<>(numbers);
        Collections.reverse(integerReversed);
        return integerReversed;
    }

    public static List<Integer> reverseIterator(List<Integer> numbers, List<Integer> numbersReversed) {
        ListIterator<Integer> iterator = numbers.listIterator(numbers.size());
        while (iterator.hasPrevious()) {
            numbersReversed.add(iterator.previous());
        }
        return numbersReversed;
    }

}
