package StackArray;

import java.util.Stack;

public class StackUsingArray {

	int [] arr=new int[4];
	int top=-1;
	
	public void push(int data)
	{
		
		if(top<4)
		{
			top++;
			arr[top]=data;
		}
		else
		{
			System.out.print("stack is overflow");
		}
		
	}
	public void pop()
	{
		int data;
		if(top==-1)
		{
		System.out.println(" stack is underflow");
			
		}
		else
		{
			data=arr[top];
			System.out.print(data + " ");
			top--;
		}
		
		
	}
	
	public void peek(){
		int data;
		if(top==-1)
		{
		System.out.println(" stack is underflow");
			
		}
		else
		{
			data=arr[top];
			System.out.print(data+ " ");
			
		}
		
	}
	public void isEmpty(){
		
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is NOT empty");
		}
	}
	
	public void display()
	{
		
		for(int i=0;i<=top;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void sort()
	{
		
		Stack s=new Stack();
		while(top>=0)
		{
			int val=arr[top];
			//System.out.println(val);
			top--;	
		
				while(!s.isEmpty() && (int)s.peek()>val)
				{
					top++;
					arr[top]=(int)s.pop();
				}
			
			s.push(val);
			
		}
		System.out.println();
		while(!s.isEmpty())
		{
			top++;
			arr[top]=(int)s.pop();
			System.out.print(arr[top]+ " ");
		}
		
	}
	
	
	
	public static void main(String args[])
	{
		StackUsingArray sa=new StackUsingArray();
		sa.push(5);
		sa.push(26);
		sa.push(81);
		sa.push(90);
		sa.display();
		System.out.println();
		
		sa.sort();

		
		System.out.println();
		sa.pop();
		sa.pop();
		System.out.println();
		System.out.print("Array after poping is : " );
		sa.display();
		
		
	
		
	}
	
	
}
