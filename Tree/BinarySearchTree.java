package Trees;

public class BinarySearchTree {
	Node root;
	
public BinarySearchTree(){
		root=null;
}
	
public void insert(int data){
//this takes O(logn)	
	
	Node node=new Node(data);
	if(root==null)
	{
		root=node;
		return;
	}
	
	Node current=root;
	Node parent=null;
	
	while(true)	
	{
		parent=current;
		
		if(node.data<current.data)
		{
			current=current.left;
			if(current==null)
			{
				parent.left=node;
				return;
			}
				
		}
		else 
		{
			current=current.right;
			if(current==null)
			{
				parent.right=node;
				return;
			}
		}
		
		
	}
	
	
	
	
	
	
	
}

public boolean search(int data){
	//this takes O(logn)	
	
	Node check=root;
	while(check!=null)
	{
		if(check.data>data)
		{
			check=check.left;
		}
		else if(check.data<data)
		{
			check=check.right;
		}
		else
		{
		  return true;
		}
		
	}
	
	return false;
	
}

public void delete(int data){
	//this takes O(logn)
	
 	
	
}

public Node getRoot()
{
	return this.root;
}
	
public void display(Node root){
	//Prints the entire tree in increas­ing order. O(n).
	
	if(root!=null)
	{
		
		display(root.left);
		System.out.print(root.data + " ");
		display(root.right);
		
	}
	
}
	
}
