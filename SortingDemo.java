import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(21);
        al.add(51);
        al.add(14);
        al.add(36);

        System.out.println("Arraylist is: "+al);

        Collections.sort(al);
        System.out.println("After sorting Arraylist is: "+al);

        Integer []arrays = {2,5,1,4,8,3}; 
        System.out.println("Array is: "+Arrays.toString(arrays));

        Arrays.sort(arrays);
        System.out.println("After sorting arrays is: "+Arrays.toString(arrays));

        Collections.sort(al,Comparator.reverseOrder());
        System.out.println("After sorting array is: "+Arrays.toString(arrays));

    }
}
