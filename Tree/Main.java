package Trees;

public class Main 
{

	
	public static void main(String args[])
	{
		
		Tree t=new Tree();
		BinarySearchTree bst=new BinarySearchTree();
		Node root=t.createTree();
		System.out.print("In-Order : ");
		t.inorderTraversal(root);
		System.out.println();
	   
	    
	    System.out.print("Pre-Order : ");
	    t.preorderTraversal(root);
	    System.out.println();
		
		
		System.out.print("Post-Order : ");
		t.postorderTraversal(root);
		System.out.println();
		
		
		System.out.print("In-Order  via iteration : ");
		t.inorderIteration(root);
		
		
		bst.insert(12);
		bst.insert(10);
		bst.insert(14);
		bst.insert(15);
		bst.insert(13);
		bst.insert(11);
		
		
		Boolean result=bst.search(11);
		System.out.println();
		System.out.println("value searched is present : " + result);
		
		System.out.println("displaying content of BST ");
		bst.display(bst.getRoot());
		
		
	}
	
}
