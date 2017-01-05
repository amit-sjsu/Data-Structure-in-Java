package StackLinkList;

public class StackUserInterface
{

	public static  void main(String args[])
	{
		StackLinkedList sl=new StackLinkedList();
		sl.push(2);
		sl.push(3);
		sl.push(4);
		sl.push(5);
		
		sl.display();
		System.out.println();
		
		int val=(int)sl.pop();
		System.out.println("value poped is : " +val);
		
		int top=(int)sl.peek();
		System.out.println("Stack top position is  : " +top);
		boolean flag=sl.isEmpty();
		System.out.println("Stack is empty : " +flag);
		
		
	}
	
}
