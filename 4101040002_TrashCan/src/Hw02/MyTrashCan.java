package Hw02;

import loader.TrashCanAb;

public class MyTrashCan extends TrashCanAb {
	private Node first, last;

	public static void main(String[] args) {

	}

	private class Node {
		String item;
		Node next;
	}

	@Override
	public void Insert(int garbage) {
		Node oldlast = last;
		last = new Node();
		last.item = Integer.toString(garbage);
		last.next = null;
		if (first == null)
			first = last;
		else
			oldlast.next = last;
	}

	@Override
	public void Empty() {
		first = null;
	}

	@Override
	public String ToString() {
		String str=null;
		if(first!=null){
		str=first.item; 
		first = first.next;
		while(first!=null){
		str = str +","+first.item;
		first = first.next;
		}
		}else{
			if (first == null)
				last = null;
			str="";
		}
		
		str = "[" + str + "]";
		return str;
	}

}
