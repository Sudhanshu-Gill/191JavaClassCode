import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> aiml = new HashMap<>();

        aiml.put(1, "ABC");
        aiml.put(2, "DEF");
        aiml.put(6, "GHI");
        aiml.put(7, "JKL");
        aiml.put(5, "MNO");

        aiml.put(3, null);
        aiml.put(4, null);
        aiml.put(4, "PQR");

        System.out.println(aiml);

        System.out.println("Map elements with for-each loop");

        System.out.println("Traversing via key");
        for(Integer key : aiml.keySet()){
            System.out.println(key+" "+aiml.get(key));
        }

        System.out.println("Traversing via entry");
        for(Map.Entry<Integer, String> entry : aiml.entrySet()){
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }

        Iterator<Map.Entry<Integer, String>> itr = aiml.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("key: "+entry.getKey() + ", value: "+ entry.getKey());
        }
    }
}
