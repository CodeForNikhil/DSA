
public class LinkedList {
	Node head;
	Node tail;
	int size = 0;
	int data;

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
	public void deletefirst() {
		Node temp = head;
		if (temp!=null) {
			head = temp.next;
		}
		else{
			temp=null;
		}
	}
	
	public void DeleteAtPos(int pos) {
		Node temp = head;
		if(pos == 0) {
			deletefirst();
		}
		else {
			Node prev = null;
			int cnt = 1;
			while(cnt<=pos) {
				prev = temp;
				temp = temp.next;
				cnt++;				
			}
			prev.next = temp.next;
		}
		
	}
	
	public void AddAtPos(int value,int pos) {
		Node temp = head;
		int cnt = 1;
		if (pos == 0) {
			insertfirst(value);
		}
		else {
		while(cnt < pos-1) {
			temp = temp.next;
			cnt++;
		}
		Node insert = new Node(value);
			insert.next = temp.next;
			temp.next = insert;
		}
	}
}