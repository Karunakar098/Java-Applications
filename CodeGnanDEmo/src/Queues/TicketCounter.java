package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class TicketCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> ticketLine = new LinkedList<>();
		ticketLine.add("Mahesh");
		ticketLine.add("Lisa");
		ticketLine.offer("Sai");
		ticketLine.offer("Nani");
		System.out.println("Element at Head:::::" + ticketLine.element());
		System.out.println(ticketLine.peek());

		System.out.println(":::Serving the passangers");
		while (!ticketLine.isEmpty()) {

			// removes & retrives the person at the front of Line
			System.out.println("Serving:: " + ticketLine.poll());

		}

	}

}
