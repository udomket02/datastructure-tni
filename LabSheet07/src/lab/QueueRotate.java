package lab;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {
	public static Queue<Integer> queue = new ArrayDeque<Integer>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		originalQueue();
		System.out.println("Queue => " + queue);

		while (true) {
			System.out.println();
			System.out.print("Press 1 to rotate queue: ");
			int choice = input.nextInt();

			if (choice == 1) {
				System.out.println("Calling queue: " + queue.peek());
				rotateQueue();
				System.out.println("Queue => " + queue);
			} else {
				System.out.println("Exit");
				break;
			}
		}

	}

	public static void rotateQueue() {
		int front = queue.poll();
		queue.offer(front);
	}

	public static void originalQueue() {
		for (int i = 101; i <= 107; i++) {
			queue.offer(i);
		}
	}
}
