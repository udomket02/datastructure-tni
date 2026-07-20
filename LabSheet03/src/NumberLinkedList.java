
public class NumberLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList numbers = new LinkedList(); // ได้ list เปล่ามาอันหนึ่ง
		
		numbers.insert(0,37);
		numbers.insert(0, 7);
		numbers.insert(0, 4);
		numbers.insert(0, 16);
		System.out.println("All element = " + numbers.traversal());
		
		// Linked List ไม่มี ตำแหน่งของตนเอง เราต้องสร้างเองที่ insert method
		numbers.insert(2, 20);
		System.out.println("Insert 20 to index 2 = " + numbers.traversal());
		
		
		numbers.insert(25); // ไม่ระบุตำแหน่งจะไปเรียกใช้ method อีกอันหนึ่งที่ไม่มี position
		System.out.println("Append 25 into list = " + numbers.traversal());
		
		numbers.remove(0);
		System.out.println("Deleted the first element = " + numbers.traversal());
		
		numbers.remove(2);
		System.out.println("Deleted element index 2 = " + numbers.traversal());
		
		numbers.removeLastElement();
		System.out.println("Deleted the last element = " + numbers.traversal());
		
		// 8.
		System.out.println("\nLength of elements = " + numbers.length());
		
		// 9.
		System.out.println("Element in index 1 = " + numbers.get(1));
		
		// 10.
		numbers.set(1, 100);
		System.out.println("Updated index 1 to 100 = " + numbers.traversal());
		
		// 11.
		numbers.clear();
		System.out.println("Clear Linked List = " + numbers.traversal());

	}

}
