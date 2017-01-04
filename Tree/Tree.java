package Trees;

import java.util.Stack;

public class Tree {

	Node root ;
	
	public Node createTree()
	{
		root =new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
	   return root;
		
	}
	
	public void inorderTraversal(Node rootValue)
	{
		  if(rootValue!=null)
		  {
			  inorderTraversal(rootValue.left);
			  System.out.print(rootValue.data + " ");
			  inorderTraversal(rootValue.right);
		  }
		
	}
	
	public void preorderTraversal(Node rootValue)
	{
		  if(rootValue!=null)
		  {
			  
			  System.out.print(rootValue.data + " ");
			  preorderTraversal(rootValue.left);
			  preorderTraversal(rootValue.right);
		  }
		
	}
	
	public void postorderTraversal(Node rootValue)
	{
		  if(rootValue!=null)
		  {
			  postorderTraversal(rootValue.left);
			  postorderTraversal(rootValue.right);
			  System.out.print(rootValue.data + " ");
		  }
		
	}
	
	public void inorderIteration(Node rootValue)
	{
		if(rootValue==null)
		{
			return;
		}
			
		Stack s = new Stack();
		Node node=rootValue;
		while(node!=null)
		{
			s.push(node);
		  node=node.left;
		}
		
		while(s.size()>0)
		{
			node=(Node)s.pop();
			System.out.print(node.data + " ");
			
			if(node.right!=null)
			{
				node=node.right;
				while(node!=null)
				{
					s.push(node);
					node=node.left;
				}
			}
		
		}
	}
	
	
	
}
