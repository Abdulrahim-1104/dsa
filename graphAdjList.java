package DataStructureAndAlgorithm;
import java.util.*;
import java.util.Queue; 
public class graphAdjList { 
	 ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
	graphAdjList(int n) { 
		 for(int i=0;i<n;i++) { 
			 adjList.add(new ArrayList<Integer>());    
		 }   
} 
	public void addd(int v, int u) {  
		adjList.get(v).add(u);   
		adjList.get(u).add(v);
	} 
	public void printt() {
		for(int i=0;i<adjList.size();i++) { 
			System.out.println("Vertex "+i);  
			for(int j=0;j<adjList.get(i).size();j++) {
				System.out.print(" "+adjList.get(i).get(j));
			}
			System.out.println("");
		} 
	}
	public void bfs(int vertex) {   
		int v= adjList.size(); 
		boolean visited[]=new boolean[v];
		Queue<Integer> q = new LinkedList<Integer>();  
		q.add(vertex); 
		visited[vertex]=true;
		while(q.size()!=0) {    
			int Vertex=q.remove(); 
			System.out.println("Vertex "+ Vertex);  
			for(int i=0;i<adjList.get(Vertex).size();i++) {
				int av=adjList.get(Vertex).get(i); 
				 if(!visited[av]) {  
					 q.add(av);  
					 visited[av]=true;  
				 } 
			}
		}      
	}
	public void dfs(int v) {
		int V=adjList.size();
		boolean visited[] = new boolean[V];
		dfss(v,visited); 
	}  
	public void dfss(int v,boolean[] visited) {  
		visited[v]=true; 
		System.out.print(v+" ");   
		for(int i=0;i<adjList.get(v).size();i++) {
			int av=adjList.get(v).get(i); 
			if(!visited[av]) {
				dfss(av,visited); 
			}  
		}
	} 
}