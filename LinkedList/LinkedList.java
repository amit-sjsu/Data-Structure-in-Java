package LinkList_practice;

import java.util.HashSet;

public class LinkedList
{
	
	 Node Start;
	public LinkedList()
	{
		Start=null;
	}

	
	public void insertAtBeg(int data)
	{
		Node temp=new Node(data,null);
		if(Start == null)
		{
			Start=temp;
			
		}
		else
		{
			temp.next=Start;
			Start=temp;
		}
		
		
	}
	
	
	public void insertAtEnd(int data)
	{
		Node temp=new Node(data,null);
		if(Start == null)
		{
			Start =temp;
		}
		else
		{
			Node current=Start;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=temp;
		 }
		
		
	}
	
	public void display()
	{
		Node current =Start;
		
		while(current !=null)
		{
			
			System.out.print(current.data);
			if(current.next!=null) System.out.print("->");
			current=current.next;
		}
		
	}
	
	public void deletenode(int data)
	{
		
		if(Start.data== data)
		{
			Start=Start.next;
		}
		else
		{
			Node current=Start;
			Node previous=null;
			while(current.data!=data)
			{
				previous=current;
				current=current.next;
				
			}
			previous.next=current.next;
			
			
		}
		
	}
	
	public void deleteAtpos(int pos)
	{
		int counter=1;
		if(pos==1)
		{
			Start=Start.next;
		}
		
		Node current=Start;
		Node previous=null;
		while(current.next!=null)
		{
			counter++;
			previous=current;
			current=current.next;
			if(counter==pos)
			{
				previous.next=current.next;
				break;
			}
			
			
		}
		if(pos==counter+1)
		{
			previous.next=null;
		}
		

		
		
		
		
		
	}
	
	public void insertAtPos(int pos,int data)
	{
		int counter=1;
		if(pos==1)
		{
			insertAtBeg(data);
		}
		
		
		
		Node current=Start;
		Node previous=null;
		while(current.next!=null)
		{
			counter++;
			previous=current;
			current=current.next;
			if(counter==pos)
			{
				Node n= new Node(data,null);
				previous.next=n;
				n.next=current;
				break;
			}
			
			
		}
		if(pos==counter+1)
		{
			insertAtEnd(data);
		}
		
		
		
		
	}


	public void removeDuplicate()
	{
		HashSet set =new HashSet();
		
		Node current =Start;
		Node previous =null;
		while(current!=null)
		{
			if(!set.contains(current.data))
			{
						
				set.add(current.data);
				previous=current;
				current=current.next;
			
			}
			else
			{
				previous.next=current.next;
				current=current.next;
				
			}
			
			
		}
		
		
		
		
	}

	public void valueFromLast(int pos)
	{
		int size=0;
		Node current=Start;
		while(current!=null)
		{
			size++;
			current=current.next;
		}
		int searchPos=size-(pos-1);
		current=Start;
		while(current!=null)
		{
			searchPos--;
			if(searchPos==0)
				break;
			
			current=current.next;
			
		}
		System.out.println(pos+ " value from end in the linkedList is " + current.data);
		
		
		
	}

   public void divideListByVlaue(int value)
{
	
	Node Before=null;
	Node StartBefore=null;;
	Node end=null;
	Node StartEnd=null;;
	
	
	Node current=Start;
	while(current!=null)
	{
		if(current.data<value)
		{
			Node n =new Node(current.data,null);
			if(Before==null)
			{
				Before=n;
				StartBefore=Before;
				
			}
			else
			{
			Before.next=n;
			Before=n;
			}			
			
		}
		else
		{ 
	
			Node n =new Node(current.data,null);
			if(end==null)
			{
				end=n;
				StartEnd=end;
			}
			else{
			end.next=n;
			end=n;
			}
		}
		
		current=current.next;
	}

	
	System.out.println("New List is :- ");
	Before.next=StartEnd;

			while(StartBefore!=null)
			{
				System.out.print(StartBefore.data+ "->");
				StartBefore=StartBefore.next;
			}
	
	
}

   public int size(Node linklist)
   {
	   int size=0;
	   while(linklist!=null)
	   {
		   size++;
		   linklist=linklist.next;
	   }
	   
	   return size;
   }
   
   
   public Node getNode()
   {
	   return Start;
   }
   
   
   public void sumList(Node first, Node second)
   {
	   Node sumList=null;
	   int value;
	   int carry=0;
	   int precarry=0;
	   int firstLength=size(first);
	 //  System.out.println(firstLength);
	   
	   int secondLength=size(second);
	   if(firstLength>=secondLength) 
	   {
		   while(first!=null)
		   {
			 value=first.data+second.data;
			 value=value+precarry;
			 if(value>9)
			 {
				 
				 carry=value/10;
				 value=value%10;
			 }
			   
			 if(sumList==null)
			 {
				 Node n= new Node(value,null);
				 sumList=n;
				 precarry=carry;
				 carry=0;
				
			 }
			 else
			 {
				
				 Node n= new Node(value,null);
				 Node current=sumList;
				 while(current.next!=null)
				 {
					 current=current.next;
				 }
				 current.next=n;
				 precarry=carry;
				 carry=0;
				 
			 }
			 
			   first=first.next;
			   second=second.next;
			  // sumList=sumList.next;

		   }
		      
	   }
	   int sum=0;
	   int k=0;
	   while(sumList!=null)
	   {
		   System.out.print(sumList.data+"->");
		   int value1=(int) (sumList.data*(Math.pow(10, k)));
		   sum=sum+value1;
		   
		   k++;   
		   sumList=sumList.next;
	   }
	   System.out.print("   "+ sum);
	      
   }
   
   public void ReverseList(Node first)
   {
	   System.out.print("List Before reversing :-  ");
	   Node check=first;
	   while(check!=null)
	   {
		   System.out.print(check.data+ "->");
		   check=check.next;
	   }
	   System.out.println();
	   System.out.print("List In reverse order is :- ");
	   Node current = first;
	   Node previous=null;
	   Node next=null;
	   while(current!=null)
	   {
		   next=current.next;
		   current.next=previous;
		   previous=current;
		   current=next;
		      
	   }

	   while(previous!=null)
	   {
		   System.out.print(previous.data + "->");
		   previous=previous.next;
	   }
	  	   
   }
   
   
   


}
