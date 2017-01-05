package Queue;

public class QueueLinkedList {
	
Node first;
Node last;

public void add(int data)
{
	Node temp=new Node(data);
	if(last!=null)
	{
		last.next=temp;
	}
	last=temp;
	if(first==null)
	{
		first=last;
	}

}


public int remove(){
	
	int value=first.data;
	first=first.next;
	if(first==null)
	{
		last=null;
	}
	
	return value;
}

public void peek()
{
	if (first==null)
	{
		System.out.println("Queue is empty");
		
	}
	else{
		 System.out.println("peek value of queue is " + first.data);
	}
	
}

public boolean isEmpty()
{
	
	
	if(first==null)
		return true;
				
	return false;		
}
	

public void display()
{
	if(first==null)
	{
		System.out.println("Queue is empty");
	}
	Node current=first;
	while(current!=null)
	{
		System.out.print(current.data + " ");
		current=current.next;
	}
	
	
}

}
