import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(2);

        System.out.println("HashSet 2: "+numbers);

        HashSet<Integer> number1 = new HashSet<>();
        number1.add(21);
        number1.add(12);
        number1.add(111);
        number1.add(23);
        System.out.println("HashSet: "+number1);

        number1.addAll(numbers);
        System.out.println("After union Set2: "+number1);

        number1.removeAll(numbers);
        System.out.println("After Differnce: "+number1);

        number1.retainAll(numbers);

        System.out.println("After Insertion: "+number1);
    }
}