package Queue;

public class UserInterface {

	
	
	public static void main(String args[])
	{
		QueueLinkedList ql =new QueueLinkedList();
		ql.add(5);
		ql.add(6);
		ql.add(7);
		ql.add(8);
		ql.add(9);
		
	   ql.display();
	   
	   ql.remove();ql.remove();
	   System.out.println();
	   ql.display();
	   
	   System.out.println();
	   ql.peek();
	   boolean flag= ql.isEmpty();
	   System.out.println("Queue is empty :" + flag);
	   
		
		
		
	}
}
