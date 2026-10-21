
import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Arun");
        a.add("Priya");
        System.out.println("ArrayList: " + a);

        LinkedList<String> l = new LinkedList<>();
        l.add("Arun");
        l.addFirst("Ravi");
        System.out.println("LinkedList: " + l);

        Vector<String> v = new Vector<>();
        v.add("Java");
        v.add("Python");
        System.out.println("Vector: " + v);

        HashSet<Integer> h = new HashSet<>();
        h.add(20);
        h.add(10);
        h.add(20);
        System.out.println("HashSet: " + h);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(30);
        lhs.add(10);
        lhs.add(30);
        System.out.println("LinkedHashSet: " + lhs);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(30);
        ts.add(10);
        ts.add(20);
        System.out.println("TreeSet: " + ts);

        Queue<String> q = new LinkedList<>();
        q.offer("First");
        q.offer("Second");
        System.out.println("Queue: " + q);
        System.out.println("Removed: " + q.poll());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Highest priority: " + pq.poll());
    }
}
