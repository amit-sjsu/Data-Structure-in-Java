package Graph;
import java.util.*;


public class Graph {

	public Node root;
	public ArrayList nodes=new ArrayList();
	public int [][] AdjMatrix;
	int size;
	
	
	public void addNode(Node node)
	{
		nodes.add(node);
		
	}
	
	public void setRootNode(Node root)
	{
		this.root=root;
	}
	public Node getRootNode()
	{
		return this.root;
	}
	
	public void connectNode(Node node1, Node node2)
	{
		
		if(AdjMatrix==null)
		{
			size=nodes.size();
			AdjMatrix=new int[size][size];
		}
		
		int startIndex=nodes.indexOf(node1);
		int endIndex=nodes.indexOf(node2);
		
		AdjMatrix[startIndex][endIndex]=1;
		AdjMatrix[endIndex][startIndex]=1;
		
	}
	
	public void dfs(Node root)
	{
		
		
		Stack s=new Stack();
		s.push(root);
		root.visited=true;
		printNode(root);
		while(!s.isEmpty())
		{
			
			Node node=(Node)s.peek();
			Node child=getUnvisitedChildNode(node);
			if(child!=null)
			{
				child.visited=true;
				printNode(child);
				s.push(child);	
				
			}
			else
			{
				s.pop();
			}
				
			
		}
		
		clearNode();	
		
	}
	
	
	public void bfs(Node root)
	{
		
		Queue q =new LinkedList();
		q.add(root);
		printNode(root);
		root.visited=true;
		while(!q.isEmpty())
		{
			Node node=(Node)q.remove();
			Node child=null;
			while((child=getUnvisitedChildNode(node))!=null)
			{
				child.visited=true;
				printNode(child);
			    q.add(child);
			   
			}
		}
		clearNode();
				
	}
	

	public Node getUnvisitedChildNode(Node n)
	{
		int index=nodes.indexOf(n);
		int j=0;
		while(j<size)
		{	
			if(AdjMatrix[index][j]==1 & ((Node)nodes.get(j)).visited==false)
			{
				
				return (Node)nodes.get(j);
			}
			j++;
					
		}	
		return null;
	}
	

	public void clearNode()
	{
		int i =0;
		while(i<size)
		{
			Node n =(Node)nodes.get(i);
			n.visited=false;
			i++;
		}
		
	}

	
	public void printNode(Node node)
	{
		
		System.out.print(node.l + " ");
		
	}
	
	
}
