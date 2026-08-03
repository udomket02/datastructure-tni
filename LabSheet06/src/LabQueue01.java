import java.util.ArrayDeque;
import java.util.Deque;

public class LabQueue01 {

	public static void main(String[] args) {

		Deque<Integer> number = new ArrayDeque<Integer>();

		for (int i = 101; i <= 105; i++) {
			number.add(i);
			System.out.println("Enqueue: " + i);
		}
		System.out.println("Queue => " + number);

		while (!number.isEmpty()) {

			System.out.println("\nCalling number: " + number.peek());
			System.out.println("Providing service number: " + number.poll());
		}

		System.out.println("\nQueue => " + number);

	}

}
