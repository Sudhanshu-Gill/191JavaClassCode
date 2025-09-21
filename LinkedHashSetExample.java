import java.util.LinkedHashSet;
import java.util.TreeSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);

        System.out.println("LinkedHashSet is: "+numbers);

        LinkedHashSet<Integer> number1 = new LinkedHashSet<>();
        number1.add(21);
        number1.add(12);
        number1.add(111);

        System.out.println("LinkedHashSet1 is: "+number1);


        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(21);
        ts.add(12);
        ts.add(111);

        System.out.println("TreeSet: "+ts);
    }
}