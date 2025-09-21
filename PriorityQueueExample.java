import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(20);
        pq.add(10);

        System.out.println("Queue is: "+pq);

        System.out.println("Adding using offer: "+pq.offer(25));

        System.out.println("Deleted: "+pq.poll());
        System.out.println("Deleted: "+pq.poll());

        System.out.println("Element on the root:"+pq.peek());

        System.out.println("Removed: "+pq.remove());

        
        pq.remove();
        System.out.println(pq.poll());
        
        System.out.println("Program is running");
        
        System.out.println(pq.isEmpty());
        
        pq.clear();
        System.out.println(pq);
    }
}
