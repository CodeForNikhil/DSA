
public class TestLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList LL = new LinkedList();
		LL.insertfirst(10);
		LL.insertfirst(20);
		LL.insertfirst(43);
		LL.insertfirst(50);
		System.out.println("Inserted elements");
		LL.Display();
		System.out.println("Entered last elements");
		LL.insertlast(45);
		LL.insertlast(78);
		LL.insertlast(89);
		LL.Display();
		System.out.println("Deleted first element");
		LL.deletefirst();
		LL.Display();
		System.out.println("Deleted through position 4");
		LL.DeleteAtPos(4);
		LL.Display();
		System.out.println("Inserting value '98' at any postion");
		LL.AddAtPos(98,1);
		LL.Display();
	}

}
