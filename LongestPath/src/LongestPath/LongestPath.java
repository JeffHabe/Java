package LongestPath;

import java.util.Iterator;
import java.util.NoSuchElementException;
import loader.LongestPathAbstract;

public class LongestPath extends LongestPathAbstract {
	private boolean[] marked;
	private int[] edgeTo;
	private int[] distTo;
	private int s;
	private Bag<Integer> reversePostorder;
	private Queue<Integer> postorder;

	@Override
	public int LongestShortestPath(int[] edgelist) {
		// TO DO 自動產生的方法 Stub
		OneDiGraph G = new OneDiGraph(edgelist);
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		distTo = new int[G.V()];
		// this.s = edgelist[edgelist.length-1];
		this.s = edgelist[0];
		DepthFirstOrder(G);
		// bfs(G, s);
		dfs(G, s);
		int longest = largest(distTo);
		return longest;
	}

	private void bfs(Graph G, int s) {
		Queue<Integer> q = new Queue<Integer>();
		q.Enqueue(s);
		marked[s] = true;
		distTo[s] = 1;
		while (!q.isEmpty()) {
			int v = q.Dequeue();
			for (int w : G.adj(v)) {
				if (!marked[w]) {
					q.Enqueue(w);
					marked[w] = true;
					edgeTo[w] = v;
					distTo[w] = distTo[v] + 1;
				}
			}
		}
	}

	void DepthFirstOrder(OneDiGraph G) {
		postorder = new Queue<Integer>();
		reversePostorder = new Bag<Integer>();
		marked = new boolean[G.V()];
		for (int v = 0; v < G.V(); v++)
			if (!marked[v]) {
				edgeTo[v]=0;
				distTo[v] = 1;
				dfs(G, v);
			}
	}

	private void dfs(OneDiGraph G, int v) {
		marked[v] = true;

		for (int w : G.adj(v))
			if (!marked[w]) {
//				postorder.Enqueue(v);
				edgeTo[w]=v;
				distTo[w] = distTo[v] + 1;
				dfs(G, w);
				reversePostorder.add(v);
			}
	}

	public static void main(String[] args) {
		int[] edgelist = { 1, 2, 1, 6, 1, 3, 2, 4, 4, 6, 3, 5, 5, 6, 5, 7, 2, 1, 6, 1, 3, 1, 4, 2, 6, 4, 5, 3, 6, 5, 7,
				5 };

		LongestPath lps = new LongestPath();

		OneDiGraph G = new OneDiGraph(edgelist);
		long startTime = System.currentTimeMillis();
		int longestPath = lps.LongestShortestPath(edgelist);
		long endTime = System.currentTimeMillis();
		long totTime = (endTime - startTime)/1000;
		 for (int v = 1; v < G.V(); v++) {
		 if (lps.hasPathTo(v))
		 for (int x : lps.pathTo(v))
		 if (x == 1)
		 System.out.print(x);
		 else
		 System.out.print("-" + x);
		 System.out.println();
		 }
		for (int x : lps.reversePostorder) {
			System.out.print(x);
		}
		System.out.println();

		System.out.println("LongestPath = " + longestPath);
		System.out.println("Using Time:" + (totTime));
	}

	public boolean hasPathTo(int v) {
		return marked[v];
	}

	public Iterable<Integer> pathTo(int v) {
		{
			if (!hasPathTo(v))
				return null;
			Bag<Integer> path = new Bag<Integer>();
			for (int x = v; x != s; x = edgeTo[x])
				path.add(x);
			path.add(s);
			return path;
		}
	}

	public static int largest(int arr[]) {
		int max = arr[0]; // <-從此開始
		for (int i = 0; i < arr.length; i++)
			if (max < arr[i])
				max = arr[i];
		return max;
	}

}

class Bag<Item> implements Iterable<Item> {
	private Node first; // first node in list
	private int N;

	private class Node {
		Item item;
		Node next;
	}

	public Bag() {
		first = null;
		N = 0;
	}

	public int size() {
		return N;
	}

	public void add(Item item) { // same as push() in Stack
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}

	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	public class ListIterator implements Iterator<Item> {
		private Node current = first;

		public boolean hasNext() {
			return current != null;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
}

class Queue<Item> implements Iterable<Item> {
	private Node<Item> first; // beginning of queue
	private Node<Item> last; // end of queue
	private int N;

	public Queue() {
		first = null;
		last = null;
		N = 0;
	}

	private static class Node<Item> {
		private Item item;
		private Node<Item> next;
	}

	public void Enqueue(Item element) {
		Node<Item> oldlast = last;
		last = new Node<Item>();
		last.item = element;
		last.next = null;
		if (isEmpty())
			first = last;
		else
			oldlast.next = last;
		N++;

	}

	public boolean isEmpty() {
		return first == null;
	}

	public Item Dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		Item item = first.item;
		first = first.next;
		N--;
		if (isEmpty())
			last = null; // to avoid loitering
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator<Item>(first);
	}

	@SuppressWarnings("hiding")
	private class ListIterator<Item> implements Iterator<Item> {
		private Node<Item> current;

		public ListIterator(Node<Item> first) {
			current = first;
		}

		public boolean hasNext() {
			return current != null;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Item next() {
			if (!hasNext())
				throw new NoSuchElementException();
			Item item = current.item;
			current = current.next;
			return item;
		}
	}

}

// Graph
class OneDiGraph extends Bag<Integer> {
	private final int V;
	private int E;
	public Bag<Integer>[] adj;
	private boolean tf[];

	@SuppressWarnings("unchecked")
	public OneDiGraph(int V) {
		this.V = V;
		this.E = 0;
		adj = ((Bag<Integer>[]) new Bag[V]);

		for (int v = 0; v < V; v++)
			adj[v] = new Bag<Integer>();
	}

	public static int largest(int arr[]) {
		int max = arr[0]; // <-從此開始
		for (int i = 0; i < arr.length; i++)
			if (max < arr[i])
				max = arr[i];
		return max + 1;
	}

	public OneDiGraph(int[] in) {
		this(largest(in)); // Read V and construct this OneDiGraph.
		tf = new boolean[in.length];
		int E = in.length; // Read E.
		for (int i = 0; i < E; i += 2) {
			// Add an edge.
			int v = in[i]; // Read a vertex,
			int w = in[i + 1]; // read another vertex,
//			if (tf[v] != true && tf[w] != true) {
//				tf[v]=true;
//				tf[w]=true;
				System.out.println(v+"->"+w);
				addEdge(v, w); // and add edge connecting them.
				
			}
			
		}
//	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);

		// adj[w].add(v);
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

}

class Graph extends Bag<Integer> {
	private final int V;
	private int E;
	public Bag<Integer>[] adj;

	@SuppressWarnings("unchecked")
	public Graph(int V) {
		this.V = V;
		this.E = 0;
		adj = ((Bag<Integer>[]) new Bag[V]);

		for (int v = 0; v < V; v++)
			adj[v] = new Bag<Integer>();
	}

	public static int largest(int arr[]) {
		int max = arr[0]; // <-從此開始
		for (int i = 0; i < arr.length; i++)
			if (max < arr[i])
				max = arr[i];
		return max + 1;
	}

	public Graph(int[] in) {
		this(largest(in)); // Read V and construct this Graph.
		// tf = new boolean[in.length];
		int E = in.length; // Read E.
		for (int i = 0; i < E; i += 2) {
			// Add an edge.
			int v = in[i]; // Read a vertex,
			int w = in[i + 1]; // read another vertex,
			addEdge(v, w); // and add edge connecting them.
		}
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

}