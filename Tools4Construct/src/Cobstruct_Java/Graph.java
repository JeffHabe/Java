package Cobstruct_Java;



public class Graph extends Bag<Integer>{
	private final int V;
	private int E;
	public Bag<Integer>[] adj;

	@SuppressWarnings("unchecked")
	public Graph(int V) {
		this.V = V;
		this.E = 0;
		adj =((Bag<Integer>[]) new Bag[V]);;
		for (int v =0; v < V; v++)
			adj[v] = new Bag<Integer>();
	}
	public static int largest(int arr[])
	  {
	     int max=arr[0];         // <-從此開始
	     for(int i=0;i<arr.length;i++)
	        if(max<arr[i])
	        max=arr[i];
	     return max+1;
	  }
	 
	public Graph(int[] in)
	{
	this(largest(in)); // Read V and construct this graph.
	int E = in.length; // Read E.
	for (int i = 0; i < E; i+=2)
	{ // Add an edge.
	int v = in[i]; // Read a vertex,
	int w = in[i+1]; // read another vertex,
	addEdge(v, w); // and add edge connecting them.
	}
	}
	public int V() { return V; }
	public int E() { return E; }
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

}
