package com.sai.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Graph {
	private int v;
	private LinkedList<Integer> adj[];
	
	public Graph(int v){
		this.v=v;
		this.adj = new LinkedList[v];
		for(int i=0;i<v;i++){
			this.adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int v,int w){
		this.adj[v].add(w);
	}
	
	public void BFS(int s){
		boolean[] visited = new boolean [this.v];
		Queue<Integer> q=new LinkedList<>();
		visited[s]=true;
		q.add(s);
		
		while(!q.isEmpty()){
			s=q.poll();
			
			System.out.println(s+" ");
			
			ListIterator<Integer> li=this.adj[s].listIterator();
			while(li.hasNext()){
				int w=li.next();
				if(!visited[w]){
					visited[w]=true;
					q.add(w);
				}
			}
			
		}
	}
	
	public void DFS(int v1){
		boolean[] visited = new boolean[this.v];
		DFSutil(v1,visited);
	}

	private void DFSutil(int v2, boolean[] visited) {
		visited[v2]=true;
		
		System.out.println(v2+" ");
		ListIterator<Integer> li=this.adj[v2].listIterator();
		while(li.hasNext()){
			int w=li.next();
			if(!visited[w])
				DFSutil(w,visited);
		}
		
	}

	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
		g.BFS(2);
		
		System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

		g.DFS(2);

	}

}
