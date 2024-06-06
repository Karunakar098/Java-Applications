package Queues;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(5);
		pq.offer(23);
		pq.offer(2);
		pq.offer(8);
		pq.offer(1);

		// examine the head of the priority queue in peek()
		System.out.println("Head of the PQ : " + pq.peek());

		// poll removes and returns the head of the queue
		while (!pq.isEmpty()) {
			System.out.println("removced element : " + pq.poll());
		}
	}

}
