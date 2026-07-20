public class LinkedList {
	private Node head;
	
	public LinkedList() {
		this.head = null; // empty linked list
	}
	public String traversal() {
		Node current_node = head; // set current node starts at head
		String result = "[";
		boolean first_node = true;
		while (current_node != null) {
			result += (!first_node ? ", " : "") + current_node.data; // ตอนแรกเป็น true เลยไม่ใส่ ", "
			current_node = current_node.next; // move to the next node
			first_node = false; // พอมากลายเป็น false เลยทำให้ ใส่ ", " 
		}
		result += "]";
		return result;
	}
	public void insert(int position,Object value) {
		Node new_node = new Node(value);
		if(head == null) {
			head = new_node;
		}else if (position == 0) { // T(N) = 0(1) เพราะไม่มี loop
			new_node.next = head;
			head = new_node;
		}else {
		    Node current_node = head; //current node starts at head
		    int current_position = 0;
		    while(current_node != null && current_position < position - 1) {
		    	current_node = current_node.next;
		    	current_position++;
		    }
		    new_node.next = current_node.next;
		    current_node.next = new_node;
		}
	}
	
	public void insert(Object value) { // ประมาณว่าถ้า user ไม่ระบุตำแหน่ง จะตาม method นี้
		Node new_node = new Node(value);
		if (head == null) {
			head = new_node;
		} else {
			Node current_node = head;
			while(current_node.next != null) {
				current_node = current_node.next;
			}
			current_node.next = new_node;
		}
		
	}
	public void remove(int position) {
		if (position == 0) { // เป็น if ที่ใช้กับ กรณี จะลบตำแหน่ง 0
			Node current_node = head;
			head = current_node.next; // เปลี่ยน head ไปตัวถัดไป ทำให้ตำแหน่งแรกที่เป็น 0 หายไป
	     	//or head = head.next;
		} else { // เงื่อนไขเมื่อจะลบตัวอืนที่ไม่ใช่ตัวแรกและตัวสุดท้าย
			Node current_node = head;
			int current_position = 0;
			while (current_node.next != null && current_position < position - 1 ) {
				current_node = current_node.next;
				current_position++;
			}
			current_node.next = current_node.next.next;
		}
	}
	public void removeLastElement() {
		if (head != null) {
		   if (head.next == null) { // หมายความว่าถ้ามีแค่ node เดียว
			   head = null; //ก็คือกลายเป็น list ว่างเปล่าไปเลย
		   } else {
			   Node current_node = head;
			   while (current_node.next.next != null) {
				   current_node = current_node.next;
			   }
			   current_node.next = null; // พอเข้าเงื่ิอนไข while จนเสร็จ current_node จะอยู่ก่อนสุเท้าย ซึ่งอันนี้ก็จะทำให้ตัวสุดท้ายเป็น null หรือลบไป
		   }
		}
	}
	
	//8.
	public int length() {
		Node current_node = head;
		int lenght_node = 0;
		
		while (current_node != null) {
			current_node = current_node.next;
			lenght_node++;
		}
		return lenght_node;
	}
	
	// 9.
	public Object get(int position) {
		Node current_node = head;
		int index = 0;
		
		while (current_node != null) {
			if (position == index) {
				break;
			} 
			current_node = current_node.next;
			index++;
		}
		return current_node.data;
	}

	// 10.
	public void set(int position, Object value) {
		//update data in node at the position
		Node current_node = head;
		int index = 0;
		
		while (current_node != null) {
			if (position == index) {
				break;
			} 
			current_node = current_node.next;
			index++;
		}
			current_node.data = value;
	}
		
	
	// 11.
	public void clear() {
		head = null;
	}

}
