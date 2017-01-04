package Graph;

public class Main{
	
	
	public static void main(String args[])
	{
		
		Node A=new Node('A');
		Node B=new Node('B');
		Node C=new Node('C');
		Node D=new Node('D');
		Node E=new Node('E');
		Node F=new Node('F');
		Node G=new Node('G');
		Node H=new Node('H');
		Node S=new Node('S');
		
		Graph g=new Graph();
		g.addNode(A);
		g.addNode(B);
		g.addNode(C);
		g.addNode(D);
		g.addNode(E);
		g.addNode(F);
		g.addNode(G);
		g.addNode(H);
		g.addNode(S);
		
		g.setRootNode(A);
		
		g.connectNode(A,B);
		g.connectNode(A,S);
		g.connectNode(S,C);
		g.connectNode(S,G);
		g.connectNode(C,D);
		g.connectNode(C,F);
		g.connectNode(C,E);
		g.connectNode(E,H);
		g.connectNode(G,H);
		
		System.out.println("DFS traversal of Graph is :- ");
		g.dfs(A);
		
		System.out.println();
		System.out.println("BFS traversal of Graph is :- ");
		g.bfs(A);
	
		
	}

}
