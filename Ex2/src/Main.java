import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = ListManager.getIntegers();
        System.out.println("Integer list: ");
        for (Integer numb : numbers) {
            System.out.println(numb);
        }
        List<Integer> numbersReversed = ListManager.reversedInteger(numbers);
        System.out.println("Reverse list: ");
        for (Integer numb : numbersReversed) {
            System.out.println(numb);
        }
        List<Integer> numbersReversedIterator = ListManager.reverseIterator(numbers, numbersReversed);
        System.out.println("Reverse iterator list with list: ");
        for (Integer numb : numbersReversedIterator) {
            System.out.println(numb);
        }


    }


}