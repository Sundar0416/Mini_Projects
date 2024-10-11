package sri;
import java.util.Queue;
import java.util.LinkedList;
public class queue1 {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.offer("hello");
		queue.offer("hi");
		queue.offer("can");
		queue.offer("water");
		queue.offer("heaven");
		queue.poll();
		queue.poll();
		System.out.print(queue);
		
		
	}

}
