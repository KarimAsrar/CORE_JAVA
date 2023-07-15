package linkedList;

public class Basicsll {
	public static void display(Node head) {
			Node temp = head;
		while(temp !=null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	public static class Node{
		
		int data;//value
		Node next;//address of next node
		
		Node(int data){
			this.data = data;
		}
	}
		
public static void main(String[] args) {
	Node a = new Node(2);//head Node
	Node b = new Node(8);
	Node c = new Node(9);
	Node d = new Node(12);
	Node e = new Node(14);
	Node f = new Node(100);
			
	a.next = b;
	b.next = c;
	c.next = d;
	d.next = e;
	e.next = f;
	
	/*Node temp = a;
	   for(int i = 1; i<=5;i++) {
		System.out.print(temp.data+" ");
		temp = temp.next;
	}
	
	Node temp = a;
	while(temp !=null) {
		System.out.print(temp.data+" ");
		temp = temp.next;
	}
	*/
	display(a);
	
  }

}


