import java.util.LinkedList;
import java.util.Queue;
public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue = reverseQueue(queue);
        System.out.println(queue);
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return queue;
        }
        int item = queue.remove();
        queue = reverseQueue(queue);
        queue.add(item);
        return queue;
    }
}
