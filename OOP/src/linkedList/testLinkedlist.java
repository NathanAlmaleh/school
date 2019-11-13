package linkedList;

public class testLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		linkedList ls = new linkedList(3);
		node n= new node(1);
		node n1= new node(2);
		node n2= new node(3);
		node n3= new node(14);
		node n4= new node(15);

		ls.Add(n);
		ls.Add(n1);
		ls.Add(n2);
		ls.Add(n3);
		ls.Add(n4);
		
		ls.printLinkedList();
		ls.reverseLinkedList();
		System.out.println();
		ls.printLinkedList();
	}

}
