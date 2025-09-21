import java.util.ArrayDeque;
public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        //Add elements
        deque.add("A");
        deque.addFirst("F");
        deque.addLast("L");

        //Add using offer
        deque.offer("C");
        deque.offerFirst("First");
        deque.offerLast("Last");

        System.out.println("Elements:"+deque);


        //Access elements
        System.out.println("First element (peek): "+deque.peek());
        System.out.println("First element (peekFirst): "+deque.peekFirst());
        System.out.println("Last element (peekLast): "+deque.peekLast());


        //Remove elements
        System.out.println("/nRemoving elements:");
        System.out.println("Removed first (removeFirst): "+deque.removeFirst());
        System.out.println("Removed last (removeLast): "+deque.removeLast());
        System.out.println("Removed first (pollFirst): "+deque.pollFirst());
        System.out.println("Removed first (pollFirst): "+deque.pollLast());

        System.out.println("Deque after removal:");
        System.out.println(deque);
    }
}
