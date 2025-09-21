import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1,"ABC");
        table.put(4,"XYZ");

        table.put(1,"PQ");

        System.out.println("Our Hashtable is: "+table);

        System.out.println(table.putIfAbsent(4, "DEF"));
        
    }
}
