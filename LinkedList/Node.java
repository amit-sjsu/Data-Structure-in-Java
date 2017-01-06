package LinkList_practice;

public class Node
{
	public int data;
	public Node next;
	
	public Node()
	{
		data=0;
		next=null;
	}
	
	public Node(int data, Node n)
	{
		this.data=data;
		next=n;
	}

}
