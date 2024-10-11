package sri;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {

		//Queue<String> queue=new PriorityQueue<String>();
		Queue<Double> queue=new PriorityQueue<Double>();
		queue.offer(0.2);
		queue.offer(3.3);
		queue.offer(4.1);
		queue.offer(3.0);
		queue.offer(6.0);
		//queue.poll();
		//queue.poll();
		while(!queue.isEmpty()) {
			System.out.print(queue);
		}
	
		
	}

}
