package StackLinkList;

import java.util.EmptyStackException;

public class StackLinkedList
{
	private Node top;
	
   public StackLinkedList()
  {
	top=null;
  }
	
	public void push(int data)
	{
		Node t=new Node(data);
		t.next=top;
		top=t;
		
	}
	public int pop()
	{
		
		if(top==null)
		{
			throw new EmptyStackException();
		}
		int item=top.data;
		top=top.next;
		return item;
	}
	
	public int peek()
	{
		if(top==null)
		{
			throw new EmptyStackException();
		}
	     return top.data;
		
	}
	public boolean isEmpty()
	{
		return top == null;
	}
	
	public void display()
	{
	  Node current = top;
	  while(current!=null)
	  {
		  System.out.print(current.data + " ");
		  current=current.next;
	  }
	  
		
	}
	
	
}
