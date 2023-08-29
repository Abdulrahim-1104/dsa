package DataStructureAndAlgorithm;
//Adjacent Matrix and Adjaent List -> On other packages
public class Graph { 
	int vertex=-1;  
	int adjMatrix[][];
	int edges; 
	Graph(int val){
		this.vertex=val;
		this.edges=0;
		adjMatrix=new int[vertex+1][vertex+1]; 
	}
	public void add(int v,int u) {
		adjMatrix[v][u]= 1;  
		adjMatrix[u][v]=1;   
		this.edges++;
	} 
	public void print() { 
		System.out.println("Edges "+edges);
		for(int i=0;i<adjMatrix.length;i++) {
			System.out.println("Vertex "+i);
			for(int j=0;j<adjMatrix.length;j++) {
			System.out.print(adjMatrix[i][j]);  
		}
			System.out.println("");

			} 
					}
	public static void main(String args[]) {
		
		Graph g=new Graph(5);
		g.add(1,3);
		g.add(2,4);
		g.add(5,1);
		g.add(4,3);
		g.add(0,5);
		g.print();
		System.out.println();
		System.out.println();
		System.out.println();
		
		graphAdjList list = new graphAdjList(6);
		list.addd(1,2);  
		list.addd(3,4);
		list.addd(0, 1); 
		list.addd(5,4);
		list.addd(3,4);
		list.addd(1,5);
		list.printt(); 
		list.bfs(5);
		list.dfs(5);
	}
 
}
