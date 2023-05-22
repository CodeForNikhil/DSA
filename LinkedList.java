
public class LinkedList {
	Node head;
	Node tail;
	int size = 0;

	public LinkedList() {
		this.size = 0;
	}

	public void insertfirst(int value) {
		Node n = new Node(value);
		n.next = head;
		head = n;

		if (tail == null) {
			tail = head;
		}
		size+=1;
	}
	public void insertlast(int value) {
		if(tail == null) {
			insertfirst(value);
			return;
		}
			Node n = new Node(value);
			tail.next = n;
			tail = n;
			size+=1;
	}
	public void Display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value + "-> ");
			temp = temp.next;

		}
		System.out.println("Completed");

	}
}