package Cobstruct_Java;


import java.util.Iterator;
import java.util.NoSuchElementException;



public class Queue<Item> implements Iterable<Item>{
	private Node<Item> first;    // beginning of queue
    private Node<Item> last;     // end of queue
    private int N;   
	public Queue() {
		first = null;
        last  = null;
        N = 0;
	}
	private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

//	public static void main(String[] args) {
//		// TODO 自動產生的方法 Stub
//
//		Queue qe = new Queue();
//		System.out.print("輸入測試次數 n :");
//		int cnt = scr.nextInt();
//		for (int i = 0; i < cnt; i++) {
//			qe.Enqueue(scr.nextInt());
//		}
//			System.out.println(qe.Dequeue());
//			cnt--;
//			qe.Enqueue(594);
//			cnt++;
//			System.out.println(qe.Dequeue());
//			cnt--;
//			qe.Enqueue(8089);
//			cnt++;
//			for (int i = 0; i <cnt ; i++) {
//				System.out.println(qe.Dequeue());
//			}
//	}
	public void Enqueue(Item element) {
		   Node<Item> oldlast = last;
	        last = new Node<Item>();
	        last.item = element;
	        last.next = null;
	        if (isEmpty()) first = last;
	        else           oldlast.next = last;
	        N++;

	}

	public boolean isEmpty(){
		 return first == null;
	}
	public Item Dequeue() {
		 if (isEmpty()) throw new NoSuchElementException("Queue underflow");
	        Item item = first.item;
	        first = first.next;
	        N--;
	        if (isEmpty()) last = null;   // to avoid loitering
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

	        public boolean hasNext()  { return current != null;                     }
	        public void remove()      { throw new UnsupportedOperationException();  }

	        public Item next() {
	            if (!hasNext()) throw new NoSuchElementException();
	            Item item = current.item;
	            current = current.next; 
	            return item;
	        }
	    }
	
	
}
