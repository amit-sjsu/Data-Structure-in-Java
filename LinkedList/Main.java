package LinkList_practice;

public class Main {

	
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.insertAtBeg(9);
		l.insertAtBeg(7);
		l.insertAtBeg(2);
		
//		l.insertAtBeg(40);
//		l.insertAtBeg(41);
//		l.insertAtBeg(42);
//		l.insertAtBeg(43);
//		l.insertAtBeg(41);
//		l.insertAtBeg(42);
//		l.insertAtBeg(43);
//		l.insertAtBeg(44);
//		l.insertAtEnd(422);
//		l.insertAtEnd(432);
//		l.insertAtEnd(422);
//		l.insertAtEnd(432);
//		l.insertAtEnd(442);
//		
//		l.display();
//		
//		l.deleteAtpos(1);	
//		l.deleteAtpos(7);
//		l.insertAtPos(2,67);
//		System.out.println();
//		l.display();
//		
//		l.insertAtPos(7,66);
//		l.insertAtPos(3,64);
//		System.out.println();
//		l.display();
//		
//		l.removeDuplicate();
//		
//		System.out.println();
		l.display();
//		
//		System.out.println();
//		l.valueFromLast(2);
//		System.out.println();
//		l.valueFromLast(3);
//		System.out.println();
//		l.valueFromLast(6);
//		
//		
//		l.divideListByVlaue(50);
//		
//		
    	System.out.println();
//		
		
		Node value1=l.getNode();
		Node value2=l.getNode();
		
		l.sumList(value1,value2);
		
		Node first=new Node(1,null);
		Node second=new Node(2,null);
		Node third=new Node(3,null);
		Node fourth=new Node(4,null);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		
	
		System.out.println();
		l.ReverseList(first);
		
		
		
		
		
	}
	
	
}
