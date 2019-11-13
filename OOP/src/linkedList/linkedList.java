package linkedList;

import java.util.Stack;

public class linkedList {
	node _head;

	public linkedList(int num) {
		_head= new node(num) ;
	}
	public void Add(node n) {
		if(_head==null) {
			_head= new node(n.data);
		}
		else {
			node temp = _head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next=n;
		}
	}
	public void printLinkedList() {
		if(_head== null)
			System.out.println("no linked list ");
		else {
			node temp= _head;
			while (temp.next!=null) {
				System.out.print(temp.data+" , ");
				temp=temp.next;
			}
		}
	}
	public boolean contains(node n) {
		if(_head == null)return false;
		else if(_head.equals(n))return true;
		else {
			node temp = _head;
			while (temp.next!=null) {
				if(temp.equals(n)) {return true;}
				temp=temp.next;
			}
		}
		return false;

	}
	public void reverseLinkedList() {
		Stack<node> st = new Stack<node>();
		node temp =_head;
		while (temp.next!=null) {
			st.push(temp);
			temp=temp.next;
		}
		node head= (node) st.pop();
		linkedList newls= new linkedList(head.data);
		while(!st.empty()) {
			node newNode= new node(st.peek().data);
			st.pop();
			newls.Add(newNode);
		}
		this._head = newls._head;
	}
}
